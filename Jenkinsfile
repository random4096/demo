pipeline {
    agent { docker { image 'openjdk:11' } }
    publishCoverage adapters: [jacocoAdapter('target/site/jacoco/jacoco.xml')]
    stages {
        stage('build') {
            steps {
                sh './mvnw clean install'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
    }
    
}