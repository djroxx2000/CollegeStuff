count = int(input("Enter number of elements to be taken: "))
word_list = []
print("Enter the words(one on each line): ", end="")
for i in range(0, count):
    word_list.append(input())
longest = ''
for i in word_list:
    if len(i) > len(longest):
        longest = i
print("Longest word is ", longest, " with length ", len(longest))
