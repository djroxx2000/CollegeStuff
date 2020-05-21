count = int(input("Enter number of elements to be taken: "))
ele_list = []
out = []
print("Enter the elements: ", end="")
for i in range(0, count):
    ele = input()
    ele_list.append(ele)
for i in ele_list:
    if i not in out:
        out.append(i)
print("List with no duplicates is \n", out)

