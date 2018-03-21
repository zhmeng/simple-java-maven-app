pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/back'
    }
    parameters {
        string(defaultValue: "TEST", description: 'What environment?', name: 'userFlag')
        // choices are newline separated
        choice(choices: 'US-EAST-1\nUS-WEST-2', description: 'What AWS region?', name: 'region')
    }
    stages {
        stage('clone front') {
            steps {
                sh "echo ${params.region}"
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