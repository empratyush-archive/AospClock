//noinspection ExpiredTargetSdkVersion GradleDependency KtxExtensionAvailable
plugins {
    id("com.android.application") version "8.4.2"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
    namespace = "com.android.deskclock"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.android.deskclock"
        minSdk = 28
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    sourceSets {
        getByName("main") {
            java { srcDirs("src", "gen") }
            res { srcDirs("res") }
            assets { srcDirs("assets") }
            manifest { srcFile("AndroidManifest.xml") }
        }
    }
}

dependencies {

    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.transition:transition:1.4.1")
    implementation("androidx.legacy:legacy-support-core-ui:1.0.0")
    implementation("androidx.legacy:legacy-support-v13:1.0.0")
    implementation("androidx.gridlayout:gridlayout:1.0.0")

    implementation("androidx.appcompat:appcompat:1.0.0")
    implementation("androidx.collection:collection:1.0.0")
    implementation("androidx.appcompat:appcompat:1.0.0")

    implementation("androidx.media:media:1.4.0")
    implementation("androidx.preference:preference:1.1.1")
    implementation("androidx.recyclerview:recyclerview:1.2.0")
    implementation("androidx.percentlayout:percentlayout:1.0.0")
    implementation("androidx.core:core:1.7.0")

    //implementation("androidx.arch.core:core-common:2.2.0")
    //implementation("androidx.appcompat:appcompat-resources:1.6.1")
    //implementation("androidx.lifecycle:lifecycle-common-java8:2.7.0")
    //implementation("androidx.annotation:annotation:1.0.0")

}