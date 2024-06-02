plugins {
    id("java")
    id("org.openapi.generator") version "7.6.0"
}

group = "com.atlassian"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("$rootDir/../openapi.json")
    outputDir.set("$rootDir")
    modelPackage.set("$group.aigateway.model")
    skipValidateSpec.set(true)
    globalProperties.set(
        mapOf(
            "models" to "",
            "modelTests" to "false",
            "modelDocs" to "false"
        )
    )
    configOptions.put("serializationLibrary", "jackson")
}

dependencies {
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")
    implementation("org.openapitools:jackson-databind-nullable:0.2.6")
    implementation("com.google.code.gson:gson:2.11.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
