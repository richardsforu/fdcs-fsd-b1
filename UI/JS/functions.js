/*

Phases in Function Execution

Phase 1: Conetxt Creation Phase:
-> All the variables declared witg 'var' keyword will be hoisted (lifted up)
   to the top of the context

Phase 2: Execution Phase
-> All functions gets executed in a sequence



Notes:
--------
1. Every js has one global scope default
2. every function invocation itself crates a new scope.
3. If any funtion has child functions, then child function has its own scope, as well
   child functions global scope is parent function
4. Every function is a object


   Types of Functions
   --------------------
   1. Named Functions
   2. Function Literal 

*/

//f1();
//function f1(){ // declaration -> named function
      //  console.log('--- f1 function');
      
//}

//f1(); // Invocation

//------------------------------






//console.log('---> N: '+n);

//var n=10;



//console.log('---> N: '+n);


//var add=function(){return 100+100}
//add();


// Child Functions

 function doTeach(){ // doTeach --< global
     console.log('-- doTeach Function');

     var t='Praveen';
     function learn(){ // learn --< doTeach
         console.log('-- learning  by '+t);
     }
     function task() {
         console.log('--- task');
     }

     return learn;
 }

var l=doTeach();
l();
l();
l();
l();
l();
















