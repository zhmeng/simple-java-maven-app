pipeline {
    agent any
    stages {
        stage('Check') {
            steps {
                bat 'java -version'
                bat 'mvn -v'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
    }
}