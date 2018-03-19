pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            steps {
                bat 'printenv'
            }
        }
        stage('Parallel Stage') {
            when {
                branch 'origin/master'
            }
            failFast true
            parallel {
                stage('Branch A') {
                    agent {
                        label "for-branch-a"
                    }
                    steps {
                        echo "On Branch A"
                    }
                }
                stage('Branch B') {
                    agent {
                        label "for-branch-b"
                    }
                    steps {
                        echo "On Branch B"
                    }
                }
            }
        }
    }
}