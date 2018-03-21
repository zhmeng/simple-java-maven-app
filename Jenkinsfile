pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
                ws("C:\\Jenkins") {
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