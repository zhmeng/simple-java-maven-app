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
                sh 'printenv'
            }
        }
        stage('Test') {
            steps {
                echo "it's a test.."
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