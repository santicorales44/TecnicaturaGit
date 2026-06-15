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