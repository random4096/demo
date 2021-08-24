pipeline {
    agent { docker { image 'openjdk' } }
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