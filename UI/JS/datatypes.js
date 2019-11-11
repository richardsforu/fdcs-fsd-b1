
/*
     JS Data Types
     ------------------
     Two Types
     1. Primitive Data Types
     2. Referenced Data types
   
*/

//1. Primitive Data Types
//---------------------------
/*
    1. Number
    2. String
    3. undefined
    4. boolean
*/

//1. Number
var x=100; // number
x=87.34;
var y=87;

//-------------
// 2. String

//x='Praveen';

var trainer='Praveen';
var sub='Java Script';

var s2='Trainer '+trainer+' is Teaching '+sub+" using some thing like ";

var s3= `
    The Trainer ${trainer} is Teaaching
    ${sub} in Kolkata city And Total is ${x+y}
`

//3. undefined
var empName;

//4. boolean

var status=false;

// ----   Equality
var v1=1000;
var v2=1000;
if(v1===v2){
    console.log('Its Tue')
}else{
    console.log('Its False'); 
}

// 2. Referenced Data types
//  How to Create Object in js

// way 1 - use new Operator
// Note: Object is the built in Object in js

var emp=new Object();

emp.name='James';
emp.age=87;
emp.salary=9475945;
emp.desig='Engineer'

var sal=emp.salary;

//-----------------------
// Way 2 - use literal style

var e1={ // JSON -> Java Script Object Notation
    name:'Praveen',
    age:87,
    salary:78797,
    address:'Hyderabad'
}


var e2={
    name:'Praveen',
    salary:497594,
    address:{
        hno:'10-10/1',
        street:'Mg Road',
        city:'Bangalore',
        state:'Karnataka'
    },
    designation:'Tester',
    skills:['Java','JS','Angular','React JS']

}

// Array of JSON Objects
var emps=[
    {id:10,name:'Abc',salary:734674},
    {id:11,name:'Abc',salary:734674},
    {id:12,name:'Abc',salary:734674},
    {id:13,name:'Abc',salary:734674},
    {id:14,name:'Abc',salary:734674},
    {id:15,name:'Abc',salary:734674}
];
// Loops in JS

 for(var emp of emps){
     console.log(emp.id+'-- '+emp.name+' -- '+emp.salary);
     
 }


console.log('----------------');

emps.forEach(emp=>{ // ES 6 Feature
    console.log(emp.id);
    
})

//-------------------------------------


let a=10;
//let a;


{
    var s11='Praveen';
}

console.log('----> '+s11);

{
    let age=98;

}

//console.log('Age--> '+age);



