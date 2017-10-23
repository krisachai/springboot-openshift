try {
   
   timeout(time: 20, unit: 'MINUTES') {
   def mvnHome   
   node{
	  stage('test'){
	  git 'https://github.com/krisachai/springboot-openshift.git'
   	  mvnHome = tool 'M3'
          sh "'${mvnHome}/bin/mvn' --setings configuration/settings.xml clean test"	
	}
          stage('build') {
            openshiftBuild(buildConfig: 'springboot-backend', showBuildLogs: 'true')
  
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
