plugins {
    id("org.gradle.guides")
}

guide {
    repositoryPath.set("gradle-guides/executing-gradle-builds-on-teamcity")
    minimumGradleVersion.set("4.10.3")
    displayName.set("Executing Gradle builds on TeamCity")
    category.set("Getting Started")
}

tasks.named("asciidoctorContentDocsTest") {
    enabled = false
}
