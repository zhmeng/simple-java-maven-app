pipeline {
    agent any
    environment {
        // set back dir
        backWorkDir='/home/jenkins/ulopay/back'
	    backWorkResourceDir='/home/jenkins/ulopay/back/service-front-cloud/src/main/resources/static'
        // set front dir
        frontWorkDir='/home/jenkins/ulopay/front'
        frontWorkResourceDir='/home/jenkins/ulopay/front/dist'
        backGit='http://172.17.20.231:10080/payservice/service-nplat.git'
        frontGit='http://172.17.20.231:10080/front_end/admin-ulo-cloud.git'
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
            input {
                message "Should we continue?"
                ok "Yes, we should."
            }
            steps {
                echo "continue"
            }
        }
        // checkout git of back 
        stage('checkout back') {
            steps {
                ws("$backWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/developer-nplat']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: '$backGit']]])
                }
            }
        }
        stage('checkout front && build front && cp front to back') {
            steps {
                ws("$frontWorkDir") {
                    checkout([$class: 'GitSCM', branches: [[name: '*/admin-ulo-cloud-dev']],
     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: '$frontGit']]])
                    sh '''
                        npm install -d
                        npm run build
                        rm -rf $backWorkResourceDir
                        cp -r $frontWorkResourceDir $backWorkResourceDir
                        rm $backWorkResourceDir/../templates/index.ftl
                        cp -r $backWorkResourceDir/index.html $backWorkResourceDir/../templates/index.ftl
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
