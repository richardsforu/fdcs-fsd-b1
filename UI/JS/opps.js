
function Employee(){
    Employee.prototype.f1=function(){
        console.log(' this is employee f1 method');
    }  
}

var emp=new Employee();
//emp.f1();

class Person{
    constructor(){
        console.log('--- Person Class '+name);
    }

    f1(){
        console.log('---  f1');
    }
    f2(){
        console.log('--- f2');
    }
}
var p=new Person();
p.f1();
p.f2();



