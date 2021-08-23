pipeline {
    agent { docker { image 'maven:3.8.1' } }
    stages {
        stage('build') {
            steps {
                sh './mvnw install'
                sh './mvnw clean'
                sh './mvnw package'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
    }
    
}