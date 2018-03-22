pipeline {
    agent any
    environment {
		baseDir = '/home/jenkins/ulopay'
        // set back dir
        backWorkDir = '$baseDir/back'
		backWorkResourceDir = '$backWorkDir/service-front-cloud/src/main/resources/static'
        // set front dir
        frontWorkDir = '/home/jenkins/ulopay/front'
    }
    stages {
		// print env
		stage('print env') {
			steps {
				echo "$baseDir"
				echo "$backWorkDir"
				echo "$backWorkResourceDir"
				echo "$frontWorkDir"
			}
		}
		stage('continue?') {
			steps {
				echo "continue?"
			}
		}
        // checkout git of back 
        stage('checkout back') {
            steps {
                ws("$backWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/developer-nplat']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/payservice/service-nplat.git']]])
                }
            }
        }
        stage('checkout front && build front && cp front to back') {
            steps {
                ws("$frontWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/admin-ulo-cloud-dev']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/front_end/admin-ulo-cloud.git']]])
                    sh '''
                        npm install -d
                        npm run build
			rm -rf 
                    '''
                }
            }
        }
        stage('back package') {
            steps {
                ws("$backWorkDir") {
                    npm install 
                }
            }
        }
        
    }
}
