val = int(input("Enter the range: "))
li = []
for i in range(1,val):
    li.append(i)
slice_front = int(input("enter first index: "))
slice_end = int(input("enter last index: "))
print(li[slice_front:slice_end])

div = int(input("Enter number to divide list by: "))

for i in li:
    if(i%div == 0):
        print (i)
