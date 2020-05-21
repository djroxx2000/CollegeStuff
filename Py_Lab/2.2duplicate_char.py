sentence = input("Enter sentence: ")
char_list = []
for char in sentence:
	if(sentence.count(char) > 1 and char_list.count(char) < 1 ):
		print(char , " occurs ", sentence.count(char), " times ")
		char_list.append(char)
		
