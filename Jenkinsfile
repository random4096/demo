pipeline {
    agent { docker { image 'openjdk:11' } }
    stages {
        stage('Build') {
            steps {
                sh './mvnw -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
            post {
                always {
                    //junit 'target/surefire-reports/*.xml'
                    jacoco( 
                        execPattern: 'target/*.exec',
                        classPattern: 'target/classes',
                        sourcePattern: 'src/main/java',
                        exclusionPattern: 'src/test*'
                    )
                }
            }
        }

        /*
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
        }*/
    }
}