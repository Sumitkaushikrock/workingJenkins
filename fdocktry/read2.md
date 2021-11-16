pipeline {
agent none
    stages {
        stage('Hello') {
            agent { label 'docker-agent-1' }
            steps {

            }
        }
    }
}