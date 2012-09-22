/*
What is the first term in Fibonacci sequence to contain 1000 digits?
*/

import java.math.BigInteger;

class Euler25
{

public static void main(String argz[])
{
  int i = 0;
  while(true)
  { 
    if(fibonacciGenerator(i).toString().length() >= 1000) break; 
    ++i;
  }
  System.out.println(i+1);
}

static BigInteger fibonacciGenerator(int termNo)
{
  if(termNo == 1)
  {
  return new BigInteger("1");
  }
  
  BigInteger first = new BigInteger("1");
  BigInteger second = new BigInteger("1");

  for(int i = termNo; i>1; i--)
  {
    if (first.compareTo(second) == 1)
    {
      second = first.add(second);
    }
    else
    {
      first = first.add(second);
    }
  }

  return first.compareTo(second) == 1 ? first : second;

}

}
