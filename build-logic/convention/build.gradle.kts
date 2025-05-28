            plugins {
                `kotlin-dsl`
            }

            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.20")
                implementation("org.jetbrains.kotlin.plugin.compose:org.jetbrains.kotlin.plugin.compose.gradle.plugin:2.1.20")

                implementation("com.android.tools.build:gradle:8.9.1")
implementation("com.google.dagger:hilt-android-gradle-plugin:2.56.1")
            }

            gradlePlugin {
                plugins {
                    register("androidLibPlugin") {
                        id = "awesome.androidlib.plugin"
                        implementationClass = "com.logic.CompositeBuildPluginAndroidLib"
                    }
                }
            }
            gradlePlugin {
                plugins {
                    register("androidAppPlugin") {
                        id = "awesome.androidapp.plugin"
                        implementationClass = "com.logic.CompositeBuildPluginAndroidApp"
                    }
                }
            }
