plugins {
    kotlin("jvm") version "1.9.21"
}

group = "ru.volkus.rate"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}