#Design a program that, entered a year, the terminal will print if
#it's a leap year or not, repeat it until the user decides to.
print("We will check which year is a leap year.")
option = 1
while option == 1:
    year = int(input("Enter a year: "))

    if (year % 4 == 0) and (year % 100 != 0) or (year % 400 == 0):
        print(f"The year {year} is a leap year.")
    else:
        print(f"The year {year} is not a leap year.")

    option = int(input("To continue, enter 1: "))
    if option != 1:
        break