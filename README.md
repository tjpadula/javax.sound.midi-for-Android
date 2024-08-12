# javax.sound.midi-for-Android
[![Build Status](https://jitpack.io/v/kshoji/javax.sound.midi-for-Android.svg)](https://jitpack.io/#kshoji/javax.sound.midi-for-Android)

This library is a porting of Java `javax.sound.midi` package.
It's used with `USB MIDI Driver` project or `BLE MIDI for Android` project.

Using this library, the existing Java MIDI project can be ported to Android app easily.

--------------------

Reasons for this fork:

- Fix the shifting bug when writing meta message data to a MIDI file. 
- Add logging for unexpected exceptions in the sequencer.
- Add ability to get all events at a given time on a track.

To use this library, put this in your app's build.gradle dependencies:

implementation 'com.github.tjpadula:javax.sound.midi-for-Android:v0.0.8-alpha'

...and ensure that you have this reference to jitpack line in settings.gradle: 

dependencyResolutionManagement {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}


Usage of the library
--------------------

For the detail, see the [wiki](https://github.com/kshoji/javax.sound.midi-for-Android/wiki).

LICENSE
=======
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
