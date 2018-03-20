pipeline {
    agent {
        node {
            label 'one-label'
            customWorkspace 'D:\\one'
        }
        node {
            label 'two-label'
            customWorkspace 'D:\\two'
        }
    }
    stages {
        stage('package') {
            agent {
                label 'one-label'
            }
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