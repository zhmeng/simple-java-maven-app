pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/back'
    }
    stages {
        stage('clone front') {
            steps {
                ws(${env.frontWorkDir}) {
                    echo 'test env'
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