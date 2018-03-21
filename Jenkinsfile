pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/back'
    }
    parameters {
        string(name: 'FRONT_DIR', defaultValue: '/home/ilkkzm/ulopay/back', description: 'fronts dir?')
    }
    stages {
        stage('clone front') {
            steps {
                echo 'test ${params.FRONT_DIR}'
                echo 'test ${env.frontWorkDir}'
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