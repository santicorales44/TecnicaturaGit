// Exercise 1: Calculate the year station
let month = 4;
let station;
if (month == 1 || month == 2 || month == 3){
    station = "Summer";
}
else if (month == 4 || month == 5 || month == 6){
    station = "Fall";
}
else if (month == 7 || month == 8 || month == 9){
    station = "Winter";
}
else if (month == 10 || month == 11 || month == 12){
    station = "Spring";
}
else{
    station = "Error. You MUST enter a number between 1 and 12";
}
console.log("The month "+month+" is in "+ station);


// Exercise 2: Hour of the day
let dayHour = 20;
let message;
if (dayHour >= 6 && dayHour <= 12){
    message = "Wakey wakey, it is time for school or work!";
}
else if (dayHour >= 13 && dayHour <= 19){
    message = "It's the afternoon, time to relax!";
}
else if (dayHour >= 20 && dayHour <= 23){
    message = "It's the night, time to sleep!";
}
else{
    message = "Incorrect value";
}
console.log(message);


// Switch structure (the syntaxis is the same as Java)
switch (month){
    case 1: case 2: case 12:
        station = "Summer";
        break;
    case 3: case 4: case 5:
        station = "Fall";
        break;
    case 6: case 7: case 8:
        station = "Winter";
        break;
    case 9: case 10: case 11:       
        station = "Spring";
        break;
        default:
            station = "Error. You MUST enter a number between 1 and 12";
}
console.log("Welcome to the station "+station);