pipeline {
    agent any
    stages {
        stage('package') {
            steps {
                script {
                    dir('xxx') {
                        bat 'git clone https:@github.com:zhmeng/simple-java-maven-app.git'
                    }
                }
            }
        }
    }
}