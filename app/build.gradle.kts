plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(ConfigData.compileSdkVersion)
    buildToolsVersion(ConfigData.buildToolsVersion)

    defaultConfig {
        applicationId("tw.tonyyang.drama")
        minSdkVersion(ConfigData.minSdkVersion)
        targetSdkVersion(ConfigData.targetSdkVersion)
        versionCode(ConfigData.versionCode)
        versionName(ConfigData.versionName)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildConfigField("String", "BASE_URL", property("BASE_URL", ""))
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    implementation(Deps.kotlin)
    implementation(Deps.AndroidX.appcompat)
    implementation(Deps.AndroidX.coreKtx)
    implementation(Deps.AndroidX.constraintLayout)
    implementation(Deps.AndroidX.Lifecycle.viewModel)
    implementation(Deps.AndroidX.Lifecycle.liveData)
    implementation(Deps.AndroidX.Navigation.fragmentKtx)
    implementation(Deps.AndroidX.Navigation.uiKtx)
    implementation(Deps.AndroidX.Room.runtime)
    implementation(Deps.materialDesign)
    implementation(Deps.Retrofit.adapter)
    implementation(Deps.Retrofit.gsonConverter)
    implementation(Deps.okhttpLoggingInterceptor)
    implementation(Deps.RxJava.android)
    implementation(Deps.RxJava.java)
    kapt(Deps.AndroidX.Room.compiler)
    androidTestImplementation(Deps.AndroidX.Room.testing)
    implementation(Deps.Glide.core)
    annotationProcessor(Deps.Glide.compiler)
    implementation(Deps.materialRatingBar)
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.AndroidX.Test.junit)
    androidTestImplementation(Deps.AndroidX.Test.espressoCore)
}