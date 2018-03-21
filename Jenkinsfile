pipeline {
    agent any
    stages {
        stage('clone front') {
            steps {
                ws('/home/ilkkzm/ulopay/front') {
                    sh '''
                        git clone http://172.17.20.231:10080/front_end/admin-ulo-cloud.git
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