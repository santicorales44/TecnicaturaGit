#Read 10 numbers and print how many are positives, negatives and neutrals.

positives_counter = 0
negatives_counter = 0
neutrals_counter = 0

for i in range(10):
    number = int(input("Enter a number: "))
    if number == 0:
        neutrals_counter += 1
    elif number > 0:
        positives_counter += 1
    else:
        negatives_counter += 1
print(f"The amount of neutral numbers is: {neutrals_counter}")
print(f"The amount of positive numbers is: {positives_counter}")
print(f"The amount of negative numbers is: {negatives_counter}")