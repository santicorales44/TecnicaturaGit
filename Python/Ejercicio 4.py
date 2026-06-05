#Exercise 4.1: Circle's area and length
#Make a program to enter the radius of a circle and report it's area and the circumference length
#Area = Pi * r2
#Length = 2 * Pi * r
#In this exercise we will need import the module math because it has pi's value
#It's written: import math
"""
import math
radius = float(input("Enter the circle's radius: "))
area = math.pi * radius ** 2
length = 2 * math.pi * radius

print(f"The circle's area is: {area:.2f}")
print(f"The circle's length is: {length:.2f}")
"""
#Exercise 4.2: Life Stages
#We'll make a program that, when the user enters their age, they will
#see the stage of their life in a brief sentence:
#0 to 10 = Childhood is incredible and beautiful :D
#10 to 19 = Adolescense may be hard, don't give up ^^
#20 to 29 = Find love, start working :)
#30 to 39 = Start a family, get engaged <3
#40 to 49 = Keep working, you are doing great!
#50 to 59 = Retire and live a bit more peacefully
#60 to 69 = Find a hobby to spend your time
#70 to 79 = Time flies, you are getting older
#80 to 89 = You depend on others, your family is there
#90 to 125 = It's time to say goodbye...

life_stage = int(input("Enter your age: "))
if life_stage >= 0 and life_stage <= 10:
    life_stage = "Childhood is incredible and beautiful :D"
elif life_stage > 10 and life_stage <= 19:
    life_stage = "Adolescence may be hard, don't give up ^^"
elif life_stage >= 20 and life_stage <= 29:
    life_stage = "Find love, start working :)"
elif life_stage >= 30 and life_stage <= 39:
    life_stage = "Start a family, get engaged <3"
elif life_stage >= 40 and life_stage <= 49:
    life_stage = "Keep working, you are doing great!"
elif life_stage >= 50 and life_stage <= 59:
    life_stage = "Retire and live a bit more peacefully"
elif life_stage >= 60 and life_stage <= 69:
    life_stage = "Find a hobby to spend your time"
elif life_stage >= 70 and life_stage <= 79:
    life_stage = "Time flies, you are getting older"
elif life_stage >= 80 and life_stage <= 89:
    life_stage = "You depend on others, your family is there"
elif life_stage >= 90 and life_stage <= 125:
    life_stage = "It's time to say goodbye..."
else:
    life_stage = "Please enter a valid age. Between 0 and 125"
print(life_stage)
