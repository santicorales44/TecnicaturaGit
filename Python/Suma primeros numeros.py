#Calculate the addition of the "N" first numbers.

addition = 0
counter = 1
N = int(input("Enter the amount of numbers to be added: "))
while counter <= N:
    addition = addition + counter
    counter += 1
print(f"The addition of the first {N} numbers is: {addition}")