#We have an amount of grades of a 10 students group. Create an algorythm to calculate
#the grade point average and the lowest grade among all the group.

addition = 0
lowest_grade = 999999

for i in range(10):
    grade = float(input("Enter the student's grade: "))
    addition += grade
    if grade < lowest_grade: lowest_grade = grade
average = addition / 10
print(f"The average grade is: {average}")
print(f"The lowest grade is: {lowest_grade}")
