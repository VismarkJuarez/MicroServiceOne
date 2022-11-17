pipeline {
    agent any

    tools {
        maven 'maven3.8.6'
        //jdk 'jdk8'
    }

    stages {
        stage('Outputting Environment and Tool Deetz'){
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    java -version
                '''
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
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