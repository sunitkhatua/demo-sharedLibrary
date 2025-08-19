def clone(String url, String branch){
  echo "Clonning Code...."
  git url: "${url}", branch: "${branch}"
  echo "Cloning Successfull"
}
