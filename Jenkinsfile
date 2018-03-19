pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            when {
                branch 'origin/master'
            }
            steps {
                echo "Origin Master - Master Branch!"
            }
        }
    }
}