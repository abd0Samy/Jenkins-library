def call(){
  when {
      expression{
          params.project == true 
      }
  }
  steps {
      echo "testing your app" 
  }
}
