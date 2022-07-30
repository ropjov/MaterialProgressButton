# MaterialProgressButton

Android library that provides a MaterialButton that allows for a loading state as in the guidelines (https://material.io/components/progress-indicators/) while keeping `MaterialButton`'s features. 

## Add to your project

1. Add the JitPack repository to your build file 

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2. Add the dependency

```groovy
dependencies {
  implementation 'com.github.ropjov:MaterialProgressButton:0.1.6'
}
```

## How to use it?

1. Replace your current `MaterialButton` tags from your .xml with `MaterialProgressButton`:

```xml
<MaterialButton
  ...
/>
```

for

```xml
<com.ropjov.materialprogressbutton.MaterialProgressButton
  ...
/>
```

2. Replace your `MaterialButton` Java/Kotlin objects with `MaterialProgressButton` objects:

```kotlin
private lateinit var button: MaterialButton
```

```kotlin
private lateinit var button: MaterialProgressButton
```

3. Use progress functions from your Activity or Aragment:
```kotlin
button.showLoading()
button.hideLoading()
```

_For an example check the app module of this project_

$$

