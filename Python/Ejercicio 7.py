#Exercise 7: Given the working hours of 5 persons and the payment rate,
#calculate the salary, and the addition of every salary.
i = 1
addition = 0
while i <= 5:
    print(f"Salary of the employee {i}. ")
    hours = float(input("Enter the worked hours per month: "))
    payment_rate = float(input("Enter the payment rate per hour: "))
    salary = hours * payment_rate
    print(f"The salary is:{salary}$")
    addition += salary
    i = i + 1
    print("")
else:
    print(f"The addition of every salary is: {addition}")
