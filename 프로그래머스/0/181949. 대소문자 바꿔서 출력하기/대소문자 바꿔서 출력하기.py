str = input()
str2 = ""
for i in str:
    if i.isupper():
        str2+=i.lower()
    elif i.islower():
        str2+=i.upper()
print(str2)