function loadImage(){
    document.getElementById("d1").innerHTML="<img src='images/img1.png' height='150' width='150'>"
}

function loadImage1(imagePath){
    var imageUrl="<img src=images/"+imagePath+" height='200' width='200'>";
    document.getElementById("d2").innerHTML=imageUrl;
}