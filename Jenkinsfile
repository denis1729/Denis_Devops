pipeline{
    agent any
      stages{
        stage('Build_quickstart'){
          steps{
                echo 'Building'
                sh './quickstart/gradlew clean assemble -p quickstart'
                  }
                }
        stage('Testing_quickstart'){
          steps{
                echo 'Runnig unit test'
                sh './quickstart/gradlew test -p quickstart'
                junit '**/test-results/test/*.xml'
                  }
                }
        stage('Publish_quickstart'){
          steps{
                echo 'Publishing Artifact'
                sh './quickstart/gradlew uploadArchives -p quickstart'
                archiveArtifacts artifacts: '**/repos/*.jar'
                  }
                }
        stage('Build_webapplication'){
          steps{
                echo 'Building'
                sh './webapplication/gradlew clean assemble -p webapplication'
                sh './webapplication/gradlew uploadArchives -p webapplication'
                archiveArtifacts artifacts: '**/repos/*.war'
                  }
                }
        stage('Testing_webapplication'){
          steps{
                echo 'Runnig unit test'
                sh './webapplication/gradlew test -p webapplication'
                junit '**/reports/tests/test/*.html'
                  }
                }

        stage('Security_webapplication'){
          steps{
                echo 'Deployment'
                sh './webapplication/gradlew sonarqube'
                sh './webapplication/gradlew dependencyCheckAnalyze'
                archiveArtifacts artifacts: '**/reports/*.html'

                  }
                }
        stage('Deploy_webapplication'){
          steps{
                echo 'Deployment'
                sh './webapplication/gradlew -b deploy.gradle copyWar'
                  }
                }
        }
}
