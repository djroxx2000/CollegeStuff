sentence = input("Enter sentence: ")
for char in sentence: 
	if(not char.isalnum()):
		sentence = sentence.replace(char, ' ')
print(sentence)
