"""
#While cycle
 counter = 0
 while counter < 78:
     print(f"We run our while cycle {counter}")
     counter += 1
 else:
     print("End of while cycle")
"""
"""
#Print numbers from 0 to 5 with the while cycle
maximum = 5
counter = 0
while counter <= maximum:
    print(counter)
    counter += 1
"""
"""
#Print numbers from 5 to 1 in descending order
minimum = 1
counter = 5
while counter >= minimum:
    print(counter)
    counter -= 1
"""
"""
#For Cycle
string = "Hello"
for letter in string:
    print(letter)
else:
    print("End of for cycle")
"""
"""
#Reserved word: break. When we find a for the first time, "break" stops all the process.
for letter in "Alemania":
    if letter == "a":
        print(f"Letter found: {letter}")
        break
else:
    print("End of for cycle")
"""
"""
#Reserved word: continue
for i in range(6):
    if i % 2 == 0:
        print(f"Value: {i}")

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"Value: {i}")
"""