def dockerBuild(String imageName, String imageTag, String dockerHubUserName) {
    sh "docker build -t ${dockerHubUserName}/${imageName}:${imageTag} ."
}
