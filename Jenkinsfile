pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean javacc:javacc package'
            }
        }
    }
}