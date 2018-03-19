pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            steps {
                echo 'This stage will be executed first.'
                script {
                    def browsers = ['chrome', 'firefox']
                    for(int i = 0; i < browsers.size() ; i++) {
                        echo "Testing the ${browsers[i]} browser"
                    }
                }
            }
        }
    }
}