def vale(x):
   sum = 0
   for i in range(0,len(x)):
      sum = sum + ord(x[i])-64
   return sum   

f = open('names.txt','r')
tempstr = f.read()
f.close()
anarray = tempstr.split('","')
anarray[0] = anarray[0].strip('"')
anarray[5162] = anarray[5162].strip('"')
anarray.sort()

sum = 0

for i in range(0,5163):
   sum = sum + (i+1)*vale(anarray[i])
print sum
