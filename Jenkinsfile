pipeline {
    agent {
        node {
            label 'my-defined-label'
            customWorkspace 'hello'
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