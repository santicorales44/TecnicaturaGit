// Data types in JavaScript
/*
Multiple lines commentaries
It's basically the same as Java
*/
var name = "Santiago"; // String data type
console.log(name);

name = 7;
console.log(name);

name = 12.3;
console.log(name);

var number = 3000; // Numeric data type
console.log(number);

var object = { // Object data type
    name: "Santiago",
    surname: "Corales",
    phoneNumber: "2604821593"
}
console.log(object);

// Boolean data type
var flag = true;
console.log(typeof flag);

// Function data type (it allows us to reuse code lines)
function myFunction(){}
console.log(typeof myFunction);

// Symbol data type
var symbol = Symbol("My symbol");
console.log(typeof symbol);

// Class data type
class person{
    constructor(name, surname){
        this.name = name;
        this.surname = surname;
    }
}
console.log(typeof person);