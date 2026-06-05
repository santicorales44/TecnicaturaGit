"""
#CLASS 6 - CONTROL STATEMENTS
#Statement if/else
condition = 10
if condition == True:
    print("True Condition")
elif condition == False:
    print("False Condition")
else:
    print("No specified condition")
"""

"""
condition = True
if condition:
    print("True Condition")
else:
    print("False Condition")
"""
"""
Simplified sintaxis
print("True Condition") if condition else print("False Condition")
"""
"""
#Exercise 1: Number to text convertion
number = int(input("Enter a number in range of 1 to 3: "))
number_text = ""
if number == 1:
    number_text = "Number one"
elif number == 2:
    number_text = "Number two"
elif number == 3:
    number_text = "Number three"
else:
    number_text = "Error. You have entered a number out of range."
print(f"The entered number is: {number} - {number_text}")
"""
