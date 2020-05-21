sentence = input("Enter sentence: ")
split_sentence = sentence.split(' ')
i=0
while(i<len(split_sentence)):
	print("Occurence of ", split_sentence[i], " is ", split_sentence.count(split_sentence[i]))
	i = i + 1
		
