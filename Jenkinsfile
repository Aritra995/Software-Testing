@Library('github.com/devbyaccident/demo-shared-pipeline') _
pipeline{
    agent any
    stages{
        // implicit checkout
        stage('Library'){
            steps{
                script{
                    helloWorld()
                }
            }
        }
        stage('functions'){
            steps{
                script{
                    helloArgs.goodbyeWorld("Jenkins")
                }
            }
        }
    }
    post{
        success{
            echo 'All pipeline stages ran successfully'
        }
    }
}