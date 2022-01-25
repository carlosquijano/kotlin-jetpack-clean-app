object Kotlin {
    const val standardLibrary = "1.5.31"
}

object BuildPlugins {
    object Versions {
        const val gradleVersion = "7.3.3"
        const val buildToolsVersion = "7.0.4"
    }
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.standardLibrary}"
}

object ScriptPlugins {
    const val infrastructure = "scripts.infrastructure"
}