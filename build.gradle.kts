buildscript {
    project.extra.apply {
        set("kotlin_version", "1.3.72")
    }

    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}


tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

tasks.named<Wrapper>("wrapper") {
    gradleVersion = "6.5"
    distributionType = Wrapper.DistributionType.ALL
}
