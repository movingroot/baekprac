using System;

namespace baek
{
  class Program
  {
    static void Main(string[] args)
    {
      string[] input1 = Console.ReadLin().Split();
      string[] input2 = Console.ReadLine().Split();
      int N = int.Parse(input1[0]);
      int X = int.Parse(input1[1]);
      
      int[] A = new Int[N];
      for (int i = 0; i < input2.Length; i++)
      {
        if(int.parse(input2[i]) < X)
        {
          A[i] = int.Parse(input2[i]);
        }
      }
      
      foreach(int ii in A)
      {
        if(ii != 0)
        {
          Console.Write("{0} ", ii);
        }
      }
    }
  }
}
