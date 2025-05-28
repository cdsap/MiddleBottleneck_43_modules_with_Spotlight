pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name = "project"
plugins {
    id("com.gradle.develocity") version "4.0.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    id("com.fueledbycaffeine.spotlight") version "0.8"

}

develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
