#Exercise 5: Grades System
#The objective of this program is to create a grades system the following way:
#We ask the user to enter a value between 0 and 10
#Then, if they entered:
#9 or 10, we print A
#8 and less than 9, we print B
#7 and less than 8, we print C
#6 and less than 7, we print D
#0 and less than 6, we print F
#Otherwise, the entered value is incorrect

grade = float(input("Enter the grade you've got: "))
if grade >= 9 and grade <= 10:
    grade = "A"
elif grade >= 8 and grade < 9:
    grade = "B"
elif grade >= 7 and grade < 8:
    grade = "C"
elif grade >= 6 and grade < 7:
    grade = "D"
elif grade >= 0 and grade < 6:
    grade = "F"
else:
    grade = "Error. Enter a grade between 0 and 10"
print(grade)