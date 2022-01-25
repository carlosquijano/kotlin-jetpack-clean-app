object Dependencies {
    const val AndroidBuildTools = "com.android.tools.build:gradle:7.0.4"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31"
}

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation(Dependencies.AndroidBuildTools)
    implementation(Dependencies.kotlinGradlePlugin)
}