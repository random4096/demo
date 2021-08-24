pipeline {
    agent { docker { image 'openjdk:11' } }
    stages {
        stage('build') {
            steps {
                sh './mvnw clean install'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
                publishCoverage adapters: [jacoco('target/site/jacoco/jacoco.xml')]
            }
        }
    }
}