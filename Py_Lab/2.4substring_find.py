sentence = input("Enter sentence: ")
substring = input("Enter substring to find: ")
if(sentence.find(substring) == 0):
	print("Substring ", substring, " found")
else:
	print("Substring ", substring, " not found")
