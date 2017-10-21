try {
   timeout(time: 20, unit: 'MINUTES') {
      node{
          stage('build') {
            openshiftBuild(buildConfig: 'springboot-backend', showBuildLogs: 'true')
  
	   }
          stage('test'){
            echo "test"
            }
          stage('deploy') {
           // openshiftDeploy(deploymentConfig: 'nodejs-mongodb-example')
          	echo "deploy"
		}
        }
   }
} catch (err) {
   echo "in catch block"
   echo "Caught: ${err}"
   currentBuild.result = 'FAILURE'
   throw err
}          
