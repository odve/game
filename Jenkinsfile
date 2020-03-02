pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage("Fix version") {
            when {
                branch 'master'
            }
            steps {
                sh 'mvn versions:set -DremoveSnapshot'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean javacc:javacc package'
            }
        }

        stage("Deploy") {
            when {
                branch 'master'
            }
            steps {
                sh 'docker build -t odve/jar-runner .'
                sh 'docker run -p 8080:80 odve/jar-runner'
            }
        }
    }
}