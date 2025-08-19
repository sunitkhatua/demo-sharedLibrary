def call(String url, String branch = "master") {
    echo "Cloning code from ${url}, branch: ${branch}"
    git url: url, branch: branch
    echo "Cloning successful"
}
