def gen_square_dict(num):
    square_dict = {x: x*x for x in range(1, num+1)}
    return square_dict


def merge_dict(dict_1, dict_2):
    dict_1.update(dict_2)
    return dict_1


def sort_dict(dict_in):
    sorted_keys = sorted(dict_in.keys())
    sorted_dict = {x: dict_in[x] for x in sorted_keys}
    return sorted_dict


def unique_dict_values(dict_in):
    return set(dict_in.values())


def largest_3(dict_in):
    return sorted(dict_in, reverse=True)[:3]


def count_freq(string_in):
    freq_list = []
    for i in range(0, len(string_in)-1):
        freq_list.append(string_in.count(string_in[i]))
    return dict(zip(string_in, freq_list))




#generate dict
val = int(input("Enter the last number for first dictionary: "))
dict1 = gen_square_dict(val)
val = int(input("Enter the last number for second dictionary: "))
dict2 = gen_square_dict(val)

#merge dict
dict3 = merge_dict(dict1, dict2)
print(dict3)

#sort dict
print(sort_dict(dict3))

#unique values in dict
print(unique_dict_values(dict3))

#largest 3 in dict
print(largest_3(dict3))

string_list = input("Enter a string: ").split()
print(string_list)
freq_dict = count_freq(string_list)
print(freq_dict)




