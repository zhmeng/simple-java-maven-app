pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/front'
    }
    stages {
        stage('clone front') {
            steps {
                ws("$frontWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/admin-ulo-cloud-dev']],
     userRemoteConfigs: [[url: 'http://172.17.20.231:10080/front_end/admin-ulo-cloud.git']]])
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