package com.logic

import org.gradle.api.Plugin
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType

class CompositeBuildPluginAndroidApp : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
                apply("com.google.devtools.ksp")
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.plugin.compose")
            }

            val moduleName = target.name.replace(":","_")
            extensions.configure<com.android.build.api.dsl.ApplicationExtension> {
                namespace = "com.performance." + target.name.replace(":","_")
                compileSdk = 35
                defaultConfig {
                    applicationId = "com.performance." + target.name.replace(":","_")
                    minSdk = 24
                    targetSdk = 35
                    versionCode = 1
                    versionName = "1.0"
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
                buildTypes {
                    getByName("release") {
                        isMinifyEnabled = false
                        proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
                    }
                }
                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_21
                    targetCompatibility = JavaVersion.VERSION_21
                }
                buildFeatures {
                    compose = true
                }
            }
            target.tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
                kotlinOptions {
                    jvmTarget = JavaVersion.VERSION_21.toString()
                }
            }


            dependencies {

            }
        }
    }
}
