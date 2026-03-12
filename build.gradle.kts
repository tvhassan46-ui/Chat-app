// build.gradle.kts file for Kotlin, Jetpack Compose, and Firebase dependencies

plugins {
    kotlin("android") version "1.5.21"
    id("com.android.application") version "7.0.0"
    id("androidx.navigation.safeargs.kotlin") version "2.3.5"
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.chatapp"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("androidx.compose.ui:ui:1.0.0")
    implementation("androidx.compose.material:material:1.0.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.0.0")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("com.google.firebase:firebase-bom:28.4.0")
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-messaging")
}
