pipeline {
    agent any

    stages {
        stage('Build') {
//             agent {
//                 docker {
//                     image 'node:18-alpine'
//                     reuseNode true
//                 }
//             }
            steps {
                sh '''
                echo "is this working?"
                mvn -version
                 #  mvn compile
                '''
            }
        }
        stage('Test') {
             steps {
                    sh '''
                      #  echo "Running tests"
                      # mvn clean test -Dcucumber-filter-tags="@smoke"
                        '''
             }
        }
    }
}