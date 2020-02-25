pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean javacc:javacc package'
            }
        }
    }
}