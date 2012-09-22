def primegen(lessthan):
  lis = [2]
  for i in range(3, lessthan):
    isprime = True
    for j in range(0,len(lis)):
      if(i%lis[j]==0):
        isprime = False
        break
    if isprime:
      lis.append(i)
  return lis
