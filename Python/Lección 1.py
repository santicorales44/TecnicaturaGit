"""
print("Hi World")
miVariable = 3
print(miVariable)
miVariable = "Hi to every student of the career"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
#You can write the type of variable it is, but it is just a reference value, it does not define anything
#if we write a = 10 it will be "int" instead of "str", even though we have written it

print(id(x))
print(id(y))
print(id(z))
#Literals are written the following way: variable x = x776 - variable y = x520 - variable z = x840

#Types int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hi Students"
print(x)
print (type(x))
x = True
print (x)
print (type(x))
x = False
print (x)
print (type(x))

#String management ( + or , )
myFavouriteGroup = "Oasis:"
characteristics = "The best band in the World"
print("My favourite Group is: "+myFavouriteGroup+" "+characteristics)
print("My favourite Group is:", myFavouriteGroup, characteristics)
number1 = "7"
number2 = "8"
print (int(number1) + int(number2))

#Boolean Types ( bool )
myBoolean = 3 > 2
print (myBoolean)

if myBoolean:
    print("The result is true")
else:
    print("The result is false")

# Process user data entrance
# input function
#result = input("Enter a number: ") #It shows a string data type
#print (result)

#Data entrance convertion (It is important here to define the type, if we do not use "intinput" then the result will be
#both numbers together. Ex: 10+10 would be 1010 instead of 20.
number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))
result = number1 + number2
print ("The result of the addition is:", result)
"""
"""
operatingA = 8
operatingB = 5
addition = operatingA + operatingB
#print ("The result of the addition is:",addition)
print (f"The result of the addition is: {addition}")

substraction = operatingA - operatingB
print (f"The result of the substraction is: {substraction}")

multiplication = operatingA * operatingB
print (f"The result of the multiplication is: {multiplication}")

division = operatingA / operatingB
print (f"The result of the division is: {division}")

# The "//" basically takes out what comes after the "." Instead of 1.6, it will be 1
integerDivision = operatingA // operatingB
print (f"The result of the integer division is: {integerDivision}")

# The "%" is the division of both variables,but it shows the remainder
remainder = operatingA % operatingB
print (f"The result of the remainder is: {remainder}")

exponentiation = operatingA ** operatingB
print (f"The result of the exponentiation is: {exponentiation}")
"""
"""
height = int(input("Enter rectangle's height: "))
width = int(input("Enter rectangle's width: "))
area = height * width
perimeter = (height + width) * 2
print("Area: ", area)
print("Perimeter: ", perimeter )
"""

"""
#Arithmetic operators
myVariable3 = 10
print(myVariable3)

#Resignation Operators
myVariable3 = myVariable3 + 1
print(myVariable3)

myVariable3 += 1
print(myVariable3)

#myVariable3 = myVariable3 -2
myVariable3 -= 2
print(myVariable3)

#myVariable3 = myVariable3 * 3
myVariable3 *= 3
print(myVariable3)

#myVariable3 = myVariable /2
myVariable3 /= 2
print(myVariable3)

#Comparing operators
d = 4
b = 2

result = d == b #We chech if they are the same
print(result)

result = d != b #We check if they're different
print(result)

result = d > b #We check if d is bigger than b
print(result)

result = d < b #We check if d is smaller than b
print(result)

result = d >=b #We check if d is bigger or equal to b
print(result)

result = d <= b
print(result)

result = d >= b
print(result)
"""

#Exercise even or odd number (par o impar)
"""
number = int(input("Enter a number: "))
print(f"The rest of the division is: {number % 2}")
if number % 2 == 0:
    print(f"The number {number} is even")
else:
    print(f"The number {number} is odd")
"""
#Exercise verify if the person is an adult or a minor
"""
num = int(input("Enter your age: "))
if num >= 18:
    print(f"You are {num}, you are an adult")
else:
    print(f"You are {num}, your are a minor")
"""
"""
#Logic operators
a = True
b = False
result = a and b
print(result)

result = a or b
print(result)

result = not a
print(result)
"""

number = int(input("Enter a number: "))
if number >= 0 and number <= 5:
    print(f"Number {number} is between the range of 0 and 5")
else:
    print(f"Number {number} is not between the range of 0 and 5")

    print("Probando Commit")






















