pipeline {
    
    agent any

    stages {
        
        stage("Build") {
            steps {
                echo("Build project")
            }
        }
        
        stage("Run UTs") {
            steps {
                echo("run unit test cases")
            }
        }
        
        stage("Run SITs") {
            steps {
                echo("run integration test cases")
            }
        }
        
        stage("deploy dev") {
            steps {
                echo("deploy to dev")
            }
        }
        
        stage("deploy qa") {
            steps {
                echo("deploy to qa")
            }
        }
     
     stage("run test on qa") {
            steps {
                echo("run test sanity automation on qa")
            }
        }
        
        stage("deploy stage") {
            steps {
                echo("deploy to stage")
            }
        }
        
        stage("run test on Stage") {
            steps {
                echo("run test sanity automation on stage")
            }
        }
        
            stage("deploy prod") {
            steps {
                echo("deploy to prod")
            }
        }
    }
}