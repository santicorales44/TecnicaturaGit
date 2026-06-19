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

// Const is used for constant values, that can't be reassigned.
const birthDate = 2006;
console.log(birthDate);

// Avoid repeating your code.
// Dry: Don´t Repeat Yourself
let days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]

switch(days){
    case "Monday":
        console.log("Today is "+days);
        break;
    case "Tuesday":
        console.log("Today is "+days);
        break;
    case "Wednsesday":
        console.log("Today is "+days);
        break;
    case "Thursday":
        console.log("Today is "+days);
        break;
    case "Friday":
        console.log("Today is "+days);
        break;
    case "Saturday":
        console.log("Today is "+days);
        break;
    case "Sunday":
        console.log("Today is "+days);
        break;               
}
let days2 = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
function getDay(n){
    if (n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n - 1];
}
console.log(getDay(5));


// Exercise Dry: Month
function months(months){
    switch(months){
        case 1:
            return "January";
        case 2:
            return "February";
        case 3:
            return "March";
        case 4:
            return "April";
        case 5:
            return "May";
        case 6:
            return "June";
        case 7:
            return "July";
        case 8:
            return "August";
        case 9:
            return "September";
        case 10:
            return "October";
        case 11:
            return "November";
        case 12:
            return "December";
        default:
            throw "Invalid month";
    }
}
console.log(months(6));