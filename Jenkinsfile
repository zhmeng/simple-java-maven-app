pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/front'
    }
    stages {
        stage('clone front') {
            steps {
                ws($frontWorkDir) {
                    sh 'pwd'
                }
            }
        }
        stage('hello') {
            steps {
                script {
                    echo "hello world add node."
                }
                sh 'ls'
            }
        }
    }
}