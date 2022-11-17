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
                sh 'cd Terraform && ls -l'
                sh 'cd Terraform && terraform init'
                sh 'ls -l'
            }
        }

        stage('Terraform plan') {
            environment {
                AWS_ACCESS_KEY = credentials('TERRAFORM_AWS_ACCESS_KEY')
                AWS_SECRET_KEY = credentials('TERRAFORM_AWS_SECRET_KEY')
            }
            steps {
                sh('cd Terraform && terraform plan -var=$AWS_ACCESS_KEY -var=AWS_SECRET_KEY=$AWS_SECRET_KEY -auto-approve')
            }
        }

        stage('Terraform apply') {
            steps {
                sh '''
                cd Terraform
                '''
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