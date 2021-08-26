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
                sh './mvnw test checkstyle:checkstyle'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco( 
                        execPattern: 'target/*.exec',
                        classPattern: 'target/classes',
                        sourcePattern: 'src/main/java',
                        exclusionPattern: 'src/test*',
                        changeBuildStatus: true,
                        maximumInstructionCoverage: '90',
                        minimumInstructionCoverage: '70'
                    )
                    recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
                    recordIssues enabledForFailure: true, tool: checkStyle()
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo WIP'
            }
        }
    }
}
