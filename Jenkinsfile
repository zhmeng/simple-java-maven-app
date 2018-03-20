pipeline {
    agent {
        node {
            label 'for-branch-a'
            customWorkspace 'D:\\one'
        }
    }
    stages {
        stage('Parallel Stage') {
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
                    steps {
                        echo "On Branch B"
                    }
                }
            }
        }
    }
}