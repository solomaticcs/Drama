object BuildPlugins {
    const val android = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val navigation =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.AndroidX.navigation}"
}

object Deps {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val okhttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp3}"
    const val materialRatingBar =
        "me.zhanghai.android.materialratingbar:library:${Versions.materialRatingBar}"
    const val junit = "junit:junit:${Versions.junit}"

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.coreKtx}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayout}"

        object Lifecycle {
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
            const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.lifecycle}"
        }

        object Navigation {
            const val fragmentKtx =
                "androidx.navigation:navigation-fragment-ktx:${Versions.AndroidX.navigation}"
            const val uiKtx =
                "androidx.navigation:navigation-ui-ktx:${Versions.AndroidX.navigation}"
        }

        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.AndroidX.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.AndroidX.room}"
            const val testing = "androidx.room:room-testing:${Versions.AndroidX.room}"
        }

        object Test {
            const val junit = "androidx.test.ext:junit:${Versions.AndroidX.extJunit}"
            const val espressoCore =
                "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}"
        }
    }

    object Retrofit {
        const val adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object RxJava {
        const val android = "io.reactivex.rxjava2:rxandroid:${Versions.RxJava.android}"
        const val java = "io.reactivex.rxjava2:rxjava:${Versions.RxJava.android}"
    }

    object Glide {
        const val core = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }
}

