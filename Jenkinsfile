pipeline {
    agent any
    environment {
        VERSION = readMavenPom().getVersion()
    }
    stages {
        stage("Echo") {
            steps {
                echo "HELLO"
            }
        }
    }
}