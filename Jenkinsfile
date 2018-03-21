pipeline {
    agent {
        node {
            label 'my-defined-label'
        }
    }
    stages {
        stage('hello') {
            steps {
                ws("C:\\Jenkins") {
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