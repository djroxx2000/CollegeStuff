def p_square(val):
    if((val**(1/2)%1) == 0):
            return 1
    return 0

def sum_10(val):
    sum = 0
    while(val > 0):
        i = val % 10
        sum = sum + i
        val = int(val / 10)
    if(sum == 10):
        return 1
    else:
        return 0

val = int(input("Enter the range: "))

for i in range(1,val):
    if(p_square(i) and sum_10(i)):
        print(i)

