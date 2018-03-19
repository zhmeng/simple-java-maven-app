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
                bat 'git branch'
            }
        }
    }
    parallel(
        "Deploy First Module" : { stage("Deploy") {
            steps {
                echo "First"
            }
        } },
        "Deploy Second Module" : { stage("Deploy") {
            steps {
                echo "Second"
            }
        } },
        "Deploy Third Module" : { stage("Deploy") {
            steps {
                echo "Third"
            }
        } },
    )
}