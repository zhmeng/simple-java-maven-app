pipeline {
    agent {
        label {
            label 'for-branch-a'
            customWorkspace 'D:\\one'
        }
        label {
            label 'for-branch-b'
            customWorkspace 'D:\\two'
        }
    }
    stage('Parallel Stage') {
        when {
            branch 'master'
        }
        failFast true
        parallel {
            stage('Branch A') {
                agent {
                    label "for-branch-a"
                }
                steps {
                    echo "On Branch A"
                }
            }
            stage('Branch B') {
                agent {
                    label "for-branch-b"
                }
                steps {
                    echo "On Branch B"
                }
            }
        }
    }
}