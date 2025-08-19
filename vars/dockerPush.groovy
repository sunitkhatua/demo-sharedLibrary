def dockerPush(String Image, String imageTag, Sting dockerHubUser){
  withCredentials([usernamePassword(credentialsId:"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }  
    sh "docker push ${dockerHubUser}/${Image}:${imageTag}"
}
