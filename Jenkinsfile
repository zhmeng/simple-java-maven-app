pipeline {
    agent {
        label hello
    }
    stages {
        stage('hello') {
            steps {
                script {
                    echo "hello world add node."
                    bat 'cd D:\\hello'
                }
                bat 'dir'
            }
        }
    }
}