pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/back'
    }
    parameters {
        string(name: 'FRONT_DIR', defaultValue: '/home/ilkkzm/ulopay/back', description: 'front's dir?')
    }
    stages {
        stage('clone front') {
            steps {
                ws(${params.FRONT_DIR}) {
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