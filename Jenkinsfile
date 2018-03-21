pipeline {
    agent {
        node {
            label 'docker'
        }
    }
    stages {
        stage('hello') {
            steps {
                ws("D:\\Jenkins") {
                    bat 'dir'
                    echo "awesome commands here instead of echo."
                }
                script {
                    echo "hello world add node."
                }
                bat 'dir'
            }
        }
    }
}