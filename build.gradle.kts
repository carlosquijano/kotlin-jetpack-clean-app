plugins {
    id(ScriptPlugins.infrastructure)
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath (BuildPlugins.androidGradlePlugin)
        classpath (BuildPlugins.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}