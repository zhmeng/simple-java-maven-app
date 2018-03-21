pipeline {
    agent {
        node {
            label 'my-defined-label'
        }
    }
    stages {
        stage('hello') {
            ws("C:\\Jenkins") {
                echo "awesome commands here instead of echo."
            }
            steps {
                script {
                    echo "hello world add node."
                }
                bat 'dir'
            }
        }
    }
}