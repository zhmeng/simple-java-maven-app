pipeline {
    agent any
    tools  {
        maven: 'mvn'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }
}