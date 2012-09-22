/* What is the sum of the digits of the number 2^1000? */

import java.util.ArrayList; 

class Euler16
{
  public static void main(String argz[])
  {
    ArrayList<Integer> twos = new ArrayList<Integer>();
    int carryflag = 0;
    twos.add(1);
    for(int i=0; i<1000; i++)
    {
      for(int j=twos.size()-1; j>=0; j--)
      {
        if(twos.get(j)>=5)
        {
          twos.set(j,(twos.get(j)*2 + carryflag)%10);
          carryflag = 0;
          if(j==0)
          {
            twos.add(0,1);
          }
          else
          {
            carryflag = 1;
          }
        }
        else
        {
          twos.set(j, twos.get(j)*2 + carryflag);
          carryflag = 0;
        }
      }
    } 
    
    int totalsum = 0;
    for(int digit:twos)
    {
      totalsum += digit;
    }
    System.out.println(totalsum);
  }
}
