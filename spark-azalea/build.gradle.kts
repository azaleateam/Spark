plugins {
    kotlin("jvm") version "2.0.0"
    `maven-publish`
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "team.azalea"
version = "0.1.0"

repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation(project(":spark-common"))
    compileOnly("net.minestom:minestom-snapshots:f71ab6d851")
    compileOnly("team.azalea:plugins:01d3bca5bf")
}
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}