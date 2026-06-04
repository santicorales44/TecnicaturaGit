"""
likes = 1145
likes = 1146
print(likes)
likes = likes + 1
print(likes)


views = 1511
comments = 1511
everyoneComments = views == comments
print(everyoneComments)

sam_strikes = 5
sam_spares = 5

leo_strikes = 4
leo_spares = 6

sam_score = sam_strikes * 30 + sam_spares * 20
leo_score = leo_strikes * 30 + leo_spares * 20

#Decide winner

print("Sam wins: ")
print(sam_score > leo_score)
print("Leo wins: ")
print(leo_score > sam_score)
"""
deposit=200
withdrawal=100
account_balance = deposit - withdrawal
print("Account balance is: ")
print(account_balance)
print("Withdrawal is: ")
print(withdrawal)

approved = withdrawal <= account_balance

denied = withdrawal > account_balance

print("Withdrawal approved. ")

print(approved)

print("Withdrawal denied. ")

print(denied)
