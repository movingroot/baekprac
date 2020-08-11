using System;
using System.Collections.Generic;

namespace baek02
{
    class Program
    {
        static void Main(string[] args)
        {
            var words = new List<char[]>();

            for (int i = 0; i < 5; i++)
            {
                words.Add(Console.ReadLine().ToCharArray());
            }

            for (int i=0; i < 15; i++)
            {
                for (int j = 0; j < 5; j++)
                {
                    if (words[j].Length > i) Console.Write(words[j][i]);
                }
            }
        }
    }
}
