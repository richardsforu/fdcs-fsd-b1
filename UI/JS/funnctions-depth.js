function doTeach(){

  var trainer='Praveen';
  console.log(trainer+ ' is teaching Java Script');
  
  var learn=function(){
      console.log('Learning from '+trainer);  
  }
  return learn;

}
var l=doTeach();
l();
l();
l();