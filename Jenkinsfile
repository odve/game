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
                sh 'mvn clean javacc:javacc package'
            }
        }
        stage("Deploy"){
          if(env.BRANCH_NAME == 'master') {
                sh 'docker build -t odve/jar-runner .'
                sh 'docker run -p 8080:80 odve/jar-runner'
          }
        }
    }
}