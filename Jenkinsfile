pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            when {
                not {
                    branch 'origin/master'
                }
            }
            steps {
                echo "Origin Master - Master Branch!"
            }
        }
    }
}