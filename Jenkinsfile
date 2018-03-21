pipeline {
    agent any
    parameters {
        string(name: 'FRONT_DIR', defaultValue: '/home/ilkkzm/ulopay/back', description: 'front's dir?')
    }
    stages {
        stage('clone front') {
            steps {
                echo 'test ${params.FRONT_DIR}'
                echo 'test ${env.FRONT_DIR}'
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