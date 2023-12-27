node {
    
    stage('Checkout') {
        git branch: 'main', credentialsId: 'github', url: 'https://github.com/Lokeshwork/tomcat-project.git'
  }
    
    stage('Test') {
        echo 'This is Push Stage'
    }
    
    stage('Build') {
        sh 'mvn clean package'
    }
 
    stage('Deploy') {
        sh 'sudo cp /home/git/tomcat-project/target/TomcatMavenApp-2.0.war /opt/tomcat/apache-tomcat-9.0.84/webapps'
    }
}
