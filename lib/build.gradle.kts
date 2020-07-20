plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)

        versionCode = 1
        versionName = "0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        coreLibraryDesugaringEnabled = false

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/*.kotlin_module")
    }

    lintOptions {
        isAbortOnError = false
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$extra.kotlin_version")
    implementation( "androidx.core:core-ktx:1.1.0")
    implementation( "androidx.appcompat:appcompat:1.1.0")
    testImplementation( "junit:junit:4.12")
    androidTestImplementation( "androidx.test.ext:junit:1.1.1")
    androidTestImplementation( "androidx.test.espresso:espresso-core:3.2.0")
}