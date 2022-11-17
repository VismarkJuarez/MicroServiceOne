pipeline {
    agent any

    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }

        stage('Vismark Stage'){
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}