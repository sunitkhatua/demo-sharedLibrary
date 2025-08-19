def call(String imageName, String imageTag, String dockerHubUserName) {
    withCredentials([usernamePassword(credentialsId: "dockerHubCred", 
                                      passwordVariable: "dockerHubPass", 
                                      usernameVariable: "dockerHubUser")]) {
        sh "echo ${dockerHubPass} | docker login -u ${dockerHubUser} --password-stdin"
        sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"
    }
}
