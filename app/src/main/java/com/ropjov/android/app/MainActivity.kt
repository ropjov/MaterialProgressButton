package com.ropjov.android.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ropjov.materialprogressbutton.MaterialProgressButton
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(), CoroutineScope {

    private var job: Job = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private lateinit var textButton: MaterialProgressButton
    private lateinit var iconButton: MaterialProgressButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadComponents()
        setUpListener(textButton)
        setUpListener(iconButton)
    }

    private fun loadComponents() {
        textButton = findViewById(R.id.textButton)
        iconButton = findViewById(R.id.iconButton)
    }

    private fun setUpListener(button: MaterialProgressButton) {
        button.setOnClickListener {
            button.isClickable = false
            button.showLoading()

            launch {
                withContext(Dispatchers.IO) {
                    Thread.sleep(2000)
                }
                button.hideLoading()
                button.isClickable = true
            }
        }
    }

}
