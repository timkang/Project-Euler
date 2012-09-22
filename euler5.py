#What is the smallest number divisible by each of the numbers 1 to 20?
import fractions
val = 1*2/fractions.gcd(1,2)
for i in range(2,21):
  val = val*i/fractions.gcd(val,i)
print val 
