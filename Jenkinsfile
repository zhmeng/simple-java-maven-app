pipeline {
    agent any
    environment {
        frontWorkDir='/home/ilkkzm/ulopay/back'
    }
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        string(name: 'CCCC', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }
    stages {
        stage('clone front') {
            steps {
                echo "test ${params.PERSON}"
                echo "test ${params.CCCC}"
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