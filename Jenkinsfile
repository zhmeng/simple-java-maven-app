pipeline {
    agent {
        label hello
    }
    stages {
        stage('hello') {
            steps {
                script {
                    echo "hello world"
                    bat 'cd D:\\hello'
                }
                bat 'dir'
            }
        }
    }
}