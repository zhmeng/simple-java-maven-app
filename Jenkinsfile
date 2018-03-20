pipeline {
    agent {
        label 'for-branch-a'
        customWorkspace 'D:\\one'
    }
    stages {
        stage('hello') {
            steps {
                bat 'dir'
            }
        }
    }
}