plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.jamal"
    compileSdk = 33 // العودة إلى 33 ليتوافق مع AGP 8.1.0

    defaultConfig {
        applicationId = "com.example.jamal"
        minSdk = 24
        targetSdk = 33 // العودة إلى 33 أيضاً
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
}

dependencies {
    // استخدام إصدارات متوافقة مع AGP 8.1.0 و compileSdk 33
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}