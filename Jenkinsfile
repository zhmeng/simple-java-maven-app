pipeline {
    agent any
    stages {
        stage('Deploy') {
            // Using 'agent none' so that the input step doesn't tie up an
            // executor waiting for input, instead it will use a "light
            // weight" process on the master
            agent none
            steps {
                // Wrap the input step in a timeout so that Jenkins won't
                // be left waiting for input forever...
                timeout(time: 5, unit: 'MINUTES') {
                    input 'Should I Deploy?'
                }
            }
        }
    }
}