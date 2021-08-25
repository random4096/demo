pipeline {
    agent { docker { image 'openjdk:11' } }
    stages {
        stage('build') {
            steps {
                sh './mvnw clean install -Dmaven.test.failure.ignore=true'
            }
        }
        stage('test') {
            steps {
                sh './mvnw test'
                jacoco( 
                    execPattern: 'target/*.exec',
                    classPattern: 'target/classes',
                    sourcePattern: 'src/main/java',
                    exclusionPattern: 'src/test*'
                )
            }
        }
    }
}