def Git(repo)
{
  git "https://github.com/Sab24ca/${repo}"
}

def Build()
{
    sh 'mvn package'
}


