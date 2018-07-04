
# Using Kotlin Android Extensions {docsify-ignore-all}

## Configuring the Dependency

In this tutorial we're going to be using Gradle but the same can be accomplished using either IntelliJ IDEA project structure or Maven. For details on setting up Gradle to work with Kotlin, see Using Gradle.

Android Extensions is a part of the Kotlin plugin for IntelliJ IDEA and Android Studio. You do not need to install additional plugins.

All you need is to enable the Android Extensions Gradle plugin in your module's build.gradle file:

apply plugin: 'kotlin-android-extensions'

## Importing synthetic properties

It is convenient to import all widget properties for a specific layout in one go:

import kotlinx.android.synthetic.main.<layout>.*

Thus if the layout filename is activity_main.xml, we'd import kotlinx.android.synthetic.main.activity_main.*.

If we want to call the synthetic properties on View, we should also import kotlinx.android.synthetic.main.activity_main.view.*.

Reference: [Kotlin Android Extensions](https://kotlinlang.org/docs/tutorials/android-plugin.html)
