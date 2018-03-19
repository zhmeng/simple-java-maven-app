pipeline {
    agent any
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE = 'sqlite'
    }
    stages {
        stage('No-op') {
            steps {
                bat 'dir'
            }
        }
        post {
            always {
                echo 'One way or another, I hava finished'
            }
            success {
                echo 'I successed!'
            }
            unstable {
                echo 'I am unstable!'
            }
            failure {
                echo 'I failure :('
            }
            changed {
                echo 'Things were different before ...'
            }
        }
    }
}