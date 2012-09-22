/*
By considering the terms in the Fibonacci sequence whose
values do not exceed four million, find the sum of the even-
valued terms.
*/

class Euler2
{

public static void main(String argz[])
{
  int termNo = 1;
  int fibVal = 1;
  int sum = 0;

  while(fibVal < 4000000)
  {  
    if(fibVal%2 == 0)
    {
    sum += fibVal;
    }
    fibVal = fibonacciGenerator(++termNo);
  }
  System.out.println(sum);
}

static int fibonacciGenerator(int termNo)
{
  if(termNo == 1)
  {
  return 1;
  }
  
  int first = 1;
  int second = 1;

  for(int i = termNo; i>1; i--)
  {
    if (first > second)
    {
      second = first + second;
    }
    else
    {
      first = first + second;
    }
  }

  return first > second ? first : second;

}

}
