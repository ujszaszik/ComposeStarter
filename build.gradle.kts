buildscript {

    repositories {
        google()
        mavenCentral()
    }

    val gradlePluginVersion by extra { "7.2.0-alpha07" }
    val kotlinPluginVersion by extra { "1.6.0" }
    val hiltPluginVersion by extra { "2.39.1" }

    dependencies {
        classpath("com.android.tools.build:gradle:$gradlePluginVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinPluginVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltPluginVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}