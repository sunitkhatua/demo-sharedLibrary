def dockerBuild(String imageName, String imagetag, String dockerHubUserName){
  sh "docker build -t ${dockerHubUserName}/${imageName}:${imagetag} ."
}
