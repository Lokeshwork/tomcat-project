node {
    
    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/Lokeshwork/tomcat-project.git'
  }
    
    stage('Test') {
        echo 'This is Push Stage'
    }
    
    stage('Build') {
        sh 'mvn install'
    }
 
    stage('Deploy') {
        sh 'sudo cp /home/git/tomcat-project/target/TomcatMavenApp-2.0.war /opt/tomcat/apache-tomcat-9.0.84/webapps'
    }
}
