pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}

/*
pipeline {
    agent any
    tools {
        maven 'M3'
      }
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
*/