import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "2.7.1"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.6.21"
  kotlin("plugin.spring") version "1.6.21"
  kotlin("plugin.jpa") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
  all {
    exclude("org.springframework.boot", "spring-boot-starter-logging")
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("org.springframework.boot:spring-boot-starter-validation")
  implementation("org.springframework.boot:spring-boot-starter-web")

  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  implementation("org.springdoc:springdoc-openapi-ui:1.6.9")
  implementation("org.springdoc:springdoc-openapi-kotlin:1.6.9")
  implementation("org.apache.logging.log4j:log4j-spring-boot:2.17.2")
  implementation("org.springframework.boot:spring-boot-starter-log4j2")
  implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.3") {
    exclude("commons-io", "commons-io")
    exclude("org.bouncycastle", "bcprov-jdk15on")
  }
  implementation ("commons-io:commons-io:2.11.0")
  implementation ("org.bouncycastle:bcprov-jdk15on:1.70")

  compileOnly("org.projectlombok:lombok")
  developmentOnly("org.springframework.boot:spring-boot-devtools")
  runtimeOnly("mysql:mysql-connector-java")
  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
  annotationProcessor("org.projectlombok:lombok")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}


