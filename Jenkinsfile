pipeline {
    agent any
    environment {
        backWorkDir = 'home/ilkkzm/ulopay/back'
        frontWorkDir = '/home/ilkkzm/ulopay/front'
    }
    stages {
        stage('checkout back') {
            steps {
                ws("$backWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/developer-nplat']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/payservice/service-nplat.git']]])
                }
            }
        }
        stage('checkout front && build front && cp front to back') {
            steps {
                ws("$frontWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/admin-ulo-cloud-dev']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/front_end/admin-ulo-cloud.git']]])
                    sh '''
                        npm install
                        npm run build
                    '''
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