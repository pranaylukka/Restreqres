node{

stages
{
    stage('SCM checkout'){
	
	git "https://github.com/pranaylukka/Restreqres"
	}
    stage("Build"){

      sh mvn clean test
		    
	}
	
    

}


}