/*
Add all the natural numbers below one thousand that are multiples of 3 or 5
*/

#include <stdio.h>

int main()
{
  int i;
  int total_sum = 0;
  for(i=1; i<1000; i++)
  {
    if(i%5==0 || i%3==0)
    {
      total_sum += i;
    }
  }
  printf("%d\n",total_sum);
  return 0;
}
