pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            when {
                not {
                    branch 'origin/master'
                }
            }
            steps {
                echo "Origin Master - Master Branch!"
                bat 'git branch'
            }
        }
        stage("Testing") {
            parallel {
                stage("Unit Tests") {
                    agent any
                    steps {
                        bat 'java -version'
                    }
                }
                stage("Functional Tests") {
                    agent any
                    steps {
                        bat 'java -version'
                    }
                }
                stage("Integration Tests") {
                    steps {
                        bat 'java -version'
                    }
                }
            }
        }
    }
}