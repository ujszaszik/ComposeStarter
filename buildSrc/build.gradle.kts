plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    api(kotlin("script-runtime"))
    api(kotlin("gradle-plugin:1.6.0"))
    api("com.android.tools.build:gradle:7.1.0-rc01")
}