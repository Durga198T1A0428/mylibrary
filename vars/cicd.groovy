def gitdownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}  
def build()
{
  sh "mvn package"
}
def deploy(jobname,ip,context)
{
  
