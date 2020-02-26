pipeline {
    agent any
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    mvn --version
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