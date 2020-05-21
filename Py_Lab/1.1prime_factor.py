def prime_fn(val):
    for i in range(2,val):
        if(val%i == 0):
            return 0
    return 1

val = int(input("Enter the value to compute prime factor of: "))
print(val)


factors = []
prime = []

for i in range(2,int(val/2)):
    if(val%i == 0):
        factors.append(i)

length = len(factors)

i=0
while(i<length):
    if(prime_fn(factors[i])):
        prime.append(factors[i])
    i = i+1  
        
print(prime)

    
    
