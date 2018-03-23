pipeline {
    agent any
    environment {
        // set back dir
        backWorkDir='/home/jenkins/ulopay/back'
//	    backWorkResourceDir='/home/jenkins/ulopay/back/service-front-cloud/src/main/resources/static'
        // set front dir
        frontWorkDir='/home/jenkins/ulopay/front'
        frontWorkResourceDir='/home/jenkins/ulopay/front/dist'
    }
    parameters {
        choice(
            choices: '公有云平台\n银行平台\n运维平台\n商户平台\n渠道平台',
            description: '请选择部署平台?',
            name: 'region'
        )
    }
    stages {
        stage('continue?') {
            input {
                message "Should we continue?"
                ok "Yes, we should."
            }
            steps {
                script {
                    if (params.region == '公有云平台') {
                        env.backWorkResourceDir = "cloud platform"
                    } else if(params.region == "银行平台") {
                        env.backWorkResourceDir = "bank platform"
                    } else if(params.region == "运维平台") {
                        env.backWorkResourceDir = "admin platform"
                    } else if(params.region == "商户平台") {
                        env.backWorkResourceDir = "mch platform"
                    } else if(params.region == "渠道平台") {
                        env.backWorkResourceDir = "chan platform"
                    }
                    echo "${env.backWorkResourceDir}"
                }
            }
        }
        stage('显示env') {
            steps {
                echo "${env.backWorkResourceDir}"
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
