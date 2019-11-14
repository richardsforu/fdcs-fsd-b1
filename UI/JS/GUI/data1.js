
var f1= document.getElementById("d1");
function showData(){  
    f1.style.backgroundColor='red';
    f1.style.width='50%';
    f1.style.marginLeft='30%';
    f1.style.textAlign='center';
    
   document.getElementById("d1").innerHTML="Data has Shown";
}

function hideData(){
    document.getElementById('d1').innerHTML='';
}

function b1ChangeColor(){
    var btn=document.getElementById('b1');
    var colorName=document.getElementById('myColor').value;
    btn.style.backgroundColor=colorName;
}

function b1ChangeColor2(){
    var btn=document.getElementById('b1');
    btn.style.color='red';
    btn.style.backgroundColor='blue';
}

function b2ChangeColor(){

}