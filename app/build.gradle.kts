plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.testcofee4"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.testcofee4"
        minSdk = 24
        targetSdk = 33
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

    buildFeatures{

        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.core:core:1.12.0")
    testImplementation("junit:junit:4.13.2")
    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.2")
    implementation ("androidx.lifecycle:lifecycle-viewmodel:2.6.2")
    implementation ("androidx.lifecycle:lifecycle-livedata:2.6.2")
    implementation ("androidx.cardview:cardview:1.0.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    implementation ("androidx.cardview:cardview:1.0.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}