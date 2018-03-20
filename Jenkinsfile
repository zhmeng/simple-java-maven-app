pipeline {
    agent {
        node {
            label 'my-defined-label'
            customWorkspace '/d/One'
        }
    }
    stages {
        stage('hello') {
            steps {
                bat 'dir'
            }
        }
    }
}