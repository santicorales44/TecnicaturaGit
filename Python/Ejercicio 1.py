"""
Exercise 1:
We have to show an expression as an algorithmic expression, in other words, make it in code
a = float(input("Enter a value for a: "))
b = float(input("Enter a value for b: "))
c = float(input("Enter a value for c: "))
result = (a ** 3 * (b ** 2 - 2 * a * c) / 2 * b)
print(f"The result is: {result}")
"""
"""
Exercise 2:
Determine the logic solution of the following operation:
a = float(input("Enter a value for a: "))
b = float(input("Enter a value for b: "))
result = ((3 + 5 * 8) < 3 and (-6 / 3 * 4) + 2 < 2) or (a > b)
print(f"The result is: {result}")
"""
"""
Exercise 3:
Change 2 variables values
For example:
a = 10  ->   a = 5
b = 5   ->   b = 10
a = 10
b = 5
aux = a
a = b
b = aux
print("The initial value of a is 10 and b is 5")
print(f"The new value of a is {a} and of b is {b}")
"""
"""
Exercise 4: Circle's area and length
Make a program to enter the radius of a circle and report it's area and the circumference length
Area = Pi * r2
Length = 2 * Pi * r
In this exercise we will need import the module math because it has pi's value
It's written: import math

import math
radius = float(input("Enter the circle's radius: "))
area = math.pi * radius ** 2
length = 2 * math.pi * radius

print(f"The circle's area is: {area:.2f}")
print(f"The circle's length is: {length:.2f}")
"""
