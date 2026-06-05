#Exercise 3.1:
#Change 2 variables values
#For example:
#a = 10  ->   a = 5
#b = 5   ->   b = 10

a = 10
b = 5
aux = a
a = b
b = aux
print("The initial value of a is 10 and of b is 5")
print(f"The new value of a is {a} and of b is {b}")

#Exercise 3.2: Calculate year station
#Ask the user to enter a month of the year, the value must be between 1 and 12, then
#we show them in which year station they are
#Summer (21/12 - 21/03) 1,2,3
#Fall (21/03 - 21/06) 4,5,6
#Winter (21/06 - 21/09) 7,8,9
#Spring (21/09 - 21/12) 10,11,12
#In the exercise we use None: this indicates the variable does not have an
#assigned value yet (it's empty) then we'll amply it
month = int(input("Enter a month of the year. You must enter a number between 1 and 12: "))
season = None
if month == 1 or month == 2 or month == 3:
    season = "Summer"
elif month == 4 or month == 5 or month == 6:
    season = "Fall"
elif month == 7 or month == 8 or month == 9:
    season = "Winter"
elif month == 10 or month == 11 or month == 12:
    season = "Spring"
else:
    season = "Error. Please enter a number between 1 and 12"
print(f"For the month: {month} the season is: {season}")
