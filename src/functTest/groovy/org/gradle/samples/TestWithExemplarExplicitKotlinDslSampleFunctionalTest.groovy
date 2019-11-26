package org.gradle.samples

class TestWithExemplarExplicitKotlinDslSampleFunctionalTest extends AbstractTestWithExemplarSampleFunctionalTest {
    @Override
    protected void makeSingleProject() {
        buildFile << """
            plugins {
                id 'org.gradle.samples'
            }

            samples.all {
                withKotlinDsl()
            }

            samples {
                demo
            }
        """
    }

    @Override
    protected void writeSampleUnderTestToDirectory(String directory) {
        writeReadmeTo(file(directory)) << """
ifndef::env-github[]
- link:{zip-base-file-name}-kotlin-dsl.zip[Download Kotlin DSL ZIP]
endif::[]
"""
        writeKotlinDslSample(directory)
    }

    @Override
    protected String getExemplarSampleConfigFileContent() {
        return """
commands: [{
    execution-subdirectory: kotlin
    executable: gradle
    args: help
    expected-output-file: showDemoSample.sample.out
}]
"""
    }
}
