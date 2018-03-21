pipeline {
    agent {
        node {
            label 'hello'
            customWorkspace '/home/ilkkzm/hello'
        }
    }
    stages {
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