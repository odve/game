pipeline {
    /*agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }*/
    agent any
        tools {
            maven 'M3'
          }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean javacc:javacc package'
            }
        }
    }
}