// Exercise to find even numbers
let number = 10;
if (number % 2 === 0){
    console.log("The number is even")
}
else{
    console.log("The number is odd")
}

// Exercise of legal age
let age = 18;
if (age >= 18){
    console.log("You are an adult")
}
else{
    console.log("You are a minor")
}

// Exercise in range
let inRange = 5;
let minValue = 0, maxValue = 10;
if (inRange >= minValue && inRange <= maxValue){
    console.log("The number is in range")
}
else{
    console.log("The number is not in range")
}

// Exercise: Is the father able to assist his son´s game?
let holidays = false, dayOff = true;
if (holidays || dayOff){
    console.log("The father can assist his son´s game")
}
else{
    console.log("The father can´t assist his son´s game")
}

// Ternary operator
let result2 = 3 > 2 ? "True" : "False";
console.log(result2);
let number2 = 9;
result2 = number2 % 2 === 0 ? "The number is Even" : "The number is Odd";
console.log(result2);


// Turn a String into a Number
let myNumber = "18";
console.log(typeof myNumber);
let age2 = Number(myNumber);
console.log(typeof age2);
if (age2 >= 18){
    console.log("You can vote")
}
else{
    console.log("You can´t vote")
}

let result3 = age2 >= 18 ? "You can vote" : "You can´t vote";
console.log(result3);

// isNaN Function
if(isNaN(age2)){
    console.log("This variable DO NOT contain only numbers")
}
else if (age2 >= 18){
    console.log("You can vote")
}
else{
    console.log("You can´t vote")
}