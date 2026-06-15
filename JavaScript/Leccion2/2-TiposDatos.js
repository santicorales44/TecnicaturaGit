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

// Undefined data type
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);
// null: it means abscence of value. there´s nothing in a variable
var y = null; // null is not a data type, but it's origin is an object type.
console.log(typeof y);

// array and Empty String data types
var cars = ["Citroen","Audi","BMW","Ford"];
console.log(cars);
console.log(typeof cars); // We ask what type of data is it.

var z = '';
console.log(z); // This means it's an empty string.
console.log(typeof z);