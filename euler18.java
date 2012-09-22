//Find the maximal sum travelling from the top of the triangle to the base

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Euler18
{
  public static void main(String argz[])
  {
    int siz = 15+1;

    int tri[][]= new int[siz][siz];
    int dyn[][]= new int[siz+1][siz+1];
    try{
    BufferedReader in = new BufferedReader(new FileReader(argz[0]));
    String currline;
    
    try
    {
      while((currline = in.readLine()) != null)
      { 
        String temp[] = currline.split(" ");
        for(int i=0;i<temp.length;i++)
        {
            tri[temp.length-1-i+1][i+1] = Integer.parseInt(temp[i]);
        }
      }
    } catch (IOException e) { e.printStackTrace();}

    } catch(FileNotFoundException e) { e.printStackTrace(); }

    int largest = 0;

    for(int i=1;i<siz;i++)
    {
      for(int j=1;j<siz+1-i;j++)
      {
        if(dyn[i-1][j] != 0 && dyn[i][j-1] != 0){
          if (dyn[i-1][j] > dyn[i][j-1]){
            dyn[i][j] = tri[i][j] + dyn[i-1][j];
            }
          else{
            dyn[i][j] = tri[i][j] + dyn[i][j-1];
            }
        }
        else if(dyn[i-1][j]!=0){
          dyn[i][j] = tri[i][j] + dyn[i-1][j];
        }
        else if(dyn[i][j-1] != 0){
          dyn[i][j] = tri[i][j] + dyn[i][j-1];
        } 
        else {
          dyn[i][j] = tri[i][j];
        }

        if (dyn[i][j] > largest)
          largest = dyn[i][j];
      }
    }

    System.out.println(largest);

  }
}
