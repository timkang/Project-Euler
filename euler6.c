/*What is the difference between the sum of the squares and the square of the sums (1-100)*/

#include <stdio.h>
#include <math.h>

int main()
{
  int iter;
  int sum_of_sq = 0;
  int sq_of_sum = 0;
  
  for(iter=1; iter<101;iter++)
  { 
    sum_of_sq += pow(iter,2);
    sq_of_sum += iter;
  }
  
  sq_of_sum = pow(sq_of_sum,2);
  printf("%f\n", fabs(sq_of_sum-sum_of_sq));
   
  return 0;
}
