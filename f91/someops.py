import math
from f91 import pr1000k as pr

def qs(numb):
  smbound = int(math.ceil(math.sqrt(numb)))
  prmlist = pr.list_lt(smbound)  
  
  numlist = []
  for i in range(1,len(prmlist)+2):
    numlist.append((smbound+i)**2 - numb)
  
  sievelist = list(numlist)
  for primeno in prmlist:
    for j in range(len(sievelist)):
      if sievelist[j]%primeno == 0:
        sievelist[j] = sievelist[j]/primeno
  
  ones = []
  for i in range(len(sievelist)):
    if sievelist[i] == 1:
      ones.append(numlist[i])
  
   
  print numlist
  print ones        

