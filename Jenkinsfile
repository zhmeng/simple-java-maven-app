pipeline {
    agent {
        node {
            label 'my-defined-label'
            customWorkspace 'D:\\Git'
        }
    }
    stages {
        stage('hello') {
            steps {
                script {
                    echo "hello world add node."
                }
                bat 'dir'
            }
        }
    }
}