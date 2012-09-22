#How many letters are needed to write all the numbers in words from 1 to 1000?

zero = ([0])
three = ([1,2,6,10])
four = ([4,5,9])
five = ([3,7,8,40,50,60])
six = ([11,12,20,30,80,90])
seven = ([15,16,70]) 
eight = ([13,14,18,19])
nine = ([17])
hundred = 7

def findr(ints):
  if ints in zero: return 0
  if ints in three: return 3
  if ints in four: return 4
  if ints in five: return 5
  if ints in six: return 6
  if ints in seven: return 7
  if ints in eight: return 8
  if ints in nine: return 9

totsum = 0

for i in range(1,1000):
  stri = str(i)
  if len(stri) == 3:
    if int(stri[1:]) < 20:
      totsum += findr(int(stri[0])) + findr(int(stri[1:])) + hundred
    else:
      totsum += findr(int(stri[0])) + findr(int(stri[1])*10) + findr(int(stri[2])) + hundred 
    if int(stri[1]) != 0 or int(stri[2]) != 0:
      totsum += 3
  elif len(stri) == 2:
    if i < 20:
      totsum += findr(i)
    else:
      totsum += findr(int(stri[0])*10) + findr(int(stri[1]));
  else: 
    totsum += findr(i)
 
print totsum + len('onethousand')
