plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.alphadev.runntrack"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.alphadev.runntrack"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")

    // Room
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.1")

    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")

    // Glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    kapt ("com.github.bumptech.glide:compiler:4.11.0")

    // Google Maps Location Services
    implementation ("com.google.android.gms:play-services-location:21.3.0")
    implementation ("com.google.android.gms:play-services-maps:19.0.0")

    // Dagger Core
    implementation ("com.google.dagger:dagger:2.28.3")
    kapt ("com.google.dagger:dagger-compiler:2.25.2")

    // Dagger Android
    api ("com.google.dagger:dagger-android:2.28.1")
    api ("com.google.dagger:dagger-android-support:2.28.1")
    kapt ("com.google.dagger:dagger-android-processor:2.23.2")

    // Easy Permissions
    implementation ("pub.devrel:easypermissions:3.0.0")

    // Timber
    implementation ("com.jakewharton.timber:timber:4.7.1")

    // MPAndroidChart
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")

    implementation ("android.arch.lifecycle:extensions:1.1.1")
}