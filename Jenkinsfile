pipeline {
    agent any
    environment {
        DISABLE_AUTH = 'true'
        DB_ENGINE = 'sqlite'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building'
                bat 'printenv'
            }
        }
        stage('Test') {
            steps {

            }
        }
        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
    }
}