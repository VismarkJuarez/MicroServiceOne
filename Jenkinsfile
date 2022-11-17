pipeline {
    agent any

    tools {
        maven 'maven3.8.6'
        terraform 'terraform15'
        //jdk 'jdk8'
    }

    stages {

        stage('Terraform init') {
            steps {
                sh 'cd Terraform'
                sh 'ls -l'
                sh 'terraform init'
                sh 'cd ~'
            }
        }

        stage('Outputting Environment and Tool Deetz'){
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    java -version
                '''
            }
        }

        stage('Maven Clean'){
            steps {
                echo "Running mvn clean"
                sh 'mvn clean'
            }
        }

        stage('Maven Install') {
            steps {
                echo 'Running mvn install'
                sh 'mvn install'
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