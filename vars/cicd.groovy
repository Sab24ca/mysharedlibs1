def Git(repo)
{
  git "https://github.com/Sab24ca/${repo}"
}

def Build()
{
    sh 'mvn package'
}

def Deploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}



def testGit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}


def runSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
 









