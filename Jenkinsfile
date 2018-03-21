pipeline {
    agent {
        node {
            label 'my-defined-label'
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