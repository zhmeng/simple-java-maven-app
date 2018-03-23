pipeline {
    agent any
    environment {
        // set back dir
        backWorkDir='/home/jenkins/ulopay/back'
	    backWorkResourceDir='/home/jenkins/ulopay/back/service-front-cloud/src/main/resources/static'
        // set front dir
        frontWorkDir='/home/jenkins/ulopay/front'
        frontWorkResourceDir='/home/jenkins/ulopay/front/dist'
    }
    parameters {
        choice(choices: 'US-EAST-1\nUS-WEST-2', description: 'What AWS region?', name: 'region')
    }
    stages {
        stage('请选择?') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
            }
            steps {
                echo "Hello, ${params.region}."
            }
        }
        // checkout git of back 
//        stage('checkout back') {
//            steps {
//                ws("$backWorkDir") {
//                    checkout([$class: 'GitSCM', branches: [[name: '*/developer-nplat']],
//     userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/payservice/service-nplat.git']]])
//                }
//            }
//        }
//        stage('checkout front && build front && cp front to back') {
//            steps {
//                ws("$frontWorkDir") {
//                    checkout([$class: 'GitSCM', branches: [[name: '*/admin-ulo-cloud-dev']],
//        userRemoteConfigs: [[credentialsId: 'gitlab-credential', url: 'http://172.17.20.231:10080/front_end/admin-ulo-cloud.git']]])
//                    sh '''
//                    npm install -d
//                    npm run build
//                    rm -rf $backWorkResourceDir
//                    cp -r $frontWorkResourceDir $backWorkResourceDir
//                    rm $backWorkResourceDir/../templates/index.ftl
//                    cp -r $backWorkResourceDir/index.html $backWorkResourceDir/../templates/index.ftl
//                    '''
//                }
//            }
//        }
//        stage('back package') {
//            steps {
//                ws("$backWorkDir") {
//                    sh '''
//                    mvn clean install
//                    '''
//                }
//            }
//        }
    }
}
