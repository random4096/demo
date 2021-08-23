pipeline {
    agent { docker { image 'maven:3.8.1' } }
    stages {
        stage('build') {
            steps {
                sh './mvnw clean package'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
            }
        }
    }
    
}