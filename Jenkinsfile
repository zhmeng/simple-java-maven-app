pipeline {
    agent {
        node {
            label 'for-branch-a'
            customWorkspace 'D:\\one'
        }
        node{
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
                steps {
                    echo "On Branch B"
                }
            }
        }
    }
}