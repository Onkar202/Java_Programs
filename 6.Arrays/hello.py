def milk(n,r1,r2,r3):
    while(n>r1 or n>r2):
        
         
    

def milk(N,r1,r2,r3):
    mmilk=0
    for i in range(0,N//r1+1):
        for j in range(0,(N-i*r1)//r2+1):
            if(N-i*r1-j*r2)>=j*r3:
                mmilk=max(mmilk,i+j)
    return mmilk

print(milk(10,11,9,8))