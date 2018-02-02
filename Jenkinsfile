pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-e DOCKER_API_VERSION=1.19  -v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}