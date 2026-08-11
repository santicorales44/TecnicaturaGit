#List = you can use any type of data (string, numbers, etc.)
names = ["Santiago","Mateo","Valentín","Martina"]
print(names)
print(names[0])
print(names[-1])
print(names[0:2]) #It only shows the 0-1 index but not the 2's index.

#Going from the beginning of the list to the index (without including it)
print(names[ :3])

#Going from the indicated index till the end.
print(names[1: ])

#Changing a value inside a list
names[3] = "Valentina"
names[0] = "Osvaldo"
print(names)

#Iterate a list
for name in names: #name is singular, the list is plural
    print(name)
else:
    print("List elements are over")

#We ask how many elements does the list have
print(len(names)) #We use the list as a parameter

#We agregate an element
names.append("Marcelo")
print(names)

#Insert a new element in a specific index
names.insert(1,"Alberto")
print(names)
names.insert(3,"Debora")
print(names)

#We eliminate an element
names.remove("Osvaldo")
print(names)

#We eliminate the last element
names.pop()
print(names)

#We elminate a specific index
del names[2]
print(names)

#We eliminate, delete or clean every element
names.clear()
print(names)

#We eliminate the list
del names
print(names)



