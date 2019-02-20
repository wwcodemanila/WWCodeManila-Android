  
# Android Basics

## Layout

### Linear Layout

**LinearLayout** is a view group that aligns all children in a single direction, vertically or horizontally. 

You can specify the layout direction with the *android:orientation attribute*.

![Linear Layout](../_media/media_android/android-linear-layout.png)


Reference: [Linear Layout](https://developer.android.com/guide/topics/ui/layout/linear) 

### Relative Layout

**RelativeLayout** is a view group that displays child views in relative positions. 

The position of each view can be specified as relative to sibling elements (such as to the left-of or below another view) or in positions relative to the parent RelativeLayout area (such as aligned to the bottom, left or center).

![Relative Layout](../_media/media_android/relativelayout.png)


Reference: [Relative Layout](https://developer.android.com/guide/topics/ui/layout/relative)

### Constraint Layout

**Constraint Layout** 

## Views

**View** is a class that represents the basic building block for user interface components. 
A View occupies a rectangular area on the screen and is responsible for drawing and event handling. 
View is the base class for widgets, which are used to create interactive UI components (buttons, text fields, etc.).

Reference: [View](https://developer.android.com/reference/android/view/View)


## TextView

**TextView** is a user interface element that displays text to the user. 

![Hello World App](../_media/media_android/android-studio-hello-world.png)

Reference: [TextView](https://developer.android.com/reference/android/widget/TextView)

## Controls
## Buttons

A **button** consists of text or an icon (or both text and an icon) that communicates what action occurs when the user touches it.

![Button](../_media/media_android/button.gif)


Reference: [Buttons](https://developer.android.com/guide/topics/ui/controls/button)

## Android Activities

> An activity represents user action

- It typically only intends to do a single action

```
Example:
1. Add Todo
2. Edit Todo
3. View Todo List
```

- For now, we could say that we would have 3 activities and each activity would represent a screen.

## Android Intents

- An intent describes the activity to be executed

    - Camera
    - Gallery
    - Contacts

## Event Listeners

## OnClickListener

### Using Kotlin Android Extensions {docsify-ignore-all}

### Configuring the Dependency

In this tutorial we're going to be using Gradle but the same can be accomplished using either IntelliJ IDEA project structure or Maven. For details on setting up Gradle to work with Kotlin, see Using Gradle.

Android Extensions is a part of the Kotlin plugin for IntelliJ IDEA and Android Studio. You do not need to install additional plugins.

All you need is to enable the Android Extensions Gradle plugin in your module's build.gradle file:

apply plugin: 'kotlin-android-extensions'

### Importing synthetic properties

It is convenient to import all widget properties for a specific layout in one go:

import kotlinx.android.synthetic.main.<layout>.*

Thus if the layout filename is activity_main.xml, we'd import kotlinx.android.synthetic.main.activity_main.*.

If we want to call the synthetic properties on View, we should also import kotlinx.android.synthetic.main.activity_main.view.*.

Reference: [Kotlin Android Extensions](https://kotlinlang.org/docs/tutorials/android-plugin.html)

- Manifest
    - Permissions
