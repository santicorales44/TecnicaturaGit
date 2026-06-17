var name = "Santiago ";
var surname = "Corales";
var fullName = name + " " + surname;
console.log(fullName);
var fullName2 = "Santiago" + " " + "Corales";
console.log(fullName2);
var together = name + 219; // It reads from left to right following the chain, it reads the number as a string type
console.log(together);
together = name + 78 + 17; // Here you can see the difference throughout the parenthesis.
console.log(together);
together = 78 + 17 + name;
console.log(together);

name += surname; // Third concatenation using the simplified operator.
console.log (name);

// Today var is not used anymore, we use let and const.
let name2 = "Santiago";
console.log(name2);

const surname2 = "Corales";
// surname2 = "Corales"; a const cannot be reassigned or modified.
console.log(surname2);

let x, y; // You can declare multiple variables in a single line.
x = 17, y = 21; // You can assign values to multiple variables in a single line.
let z = x + y; // We assign the value of the operation.
console.log(z);
let _1num = 31;
let breaking = "Break"; // Don't use reserved words as variable names.

console.log(_1num);
console.log(breaking);
















