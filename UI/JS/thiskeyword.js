// glbal scope
var person={ // object scope
    pname:'Praveen',
    sayName:function(){ // function scope
        pname='James';
        //console.log('I am '+pname) // james
        console.log('I am '+this.pname); // Praveen --> calling obj data
       // console.log('I am '+person.pname); // Praveen // bad
    }
   
}
//person.sayName();
//var p1=person;

//person={pname:'Ria'}
//p1.sayName();

 //var p1={name:'Praveen',sayName:function(){console.log('name: '+this.name)}}
 //var p2={name:'Ria',sayName:function(){console.log('name: '+this.name)}}

//p1.sayName();
//p2.sayName();

//---------------

function sayNameForAll(msg,from){
    console.log(msg+' I am  '+this.name+' from '+from);
}
var p1={name:'Praveen',from:'Goa'}
var p2={name:'Ria',from:'AP'}


//sayNameForAll();
// Functiuon Bindings : 3 ways -> call, apply , bind

// Way-1  --> call
//sayNameForAll.call(p1,'H1','Kolkata');
//sayNameForAll.call(p2,'Hello','Bangalore');

// Way - 2  --> apply

//sayNameForAll.apply(p1,['Hi','Hyderabad']);
//sayNameForAll.apply(p2,['Good Morning!','Kolkata']);

// Way -3 --> bind

var f1=sayNameForAll.bind(p1,'Hello','Bangalore');
f1('Hi','Goa');
f1('Good Morning','Pune');
f1();
f1();
f1();

















