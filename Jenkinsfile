pipeline {
    agent any
    stages {
        stage('hello') {
            steps {
                ws("D:\\Jenkins") {
                    bat 'dir'
                    bat 'mkdir xxxx'
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