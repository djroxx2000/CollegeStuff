def last_ele(tup):
    return tup[-1]


def sort_tuple(tuples):
    repeat = len(tuples)-1
    for i in range(0, len(tuples)-1):
        for j in range(0, repeat):
            if int(last_ele(tuples[j])) > int(last_ele(tuples[j+1])):
                tuples[j], tuples[j+1] = tuples[j+1], tuples[j]
        repeat = repeat-1
    return tuples


input_line = input("Enter list of tuples(each tuple on different line): ")
tuples_in = []
while input_line != '':
    tuples_in.append(tuple(input_line.split()))
    input_line = input()
print(sort_tuple(tuples_in))
