using System;

namespace baek
{
    class Program{
        static void Main(){
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            int d = int.Parse(Console.ReadLine());
            int p = int.Parse(Console.ReadLine());

            if(c < p)
            {
                if(a*p <= b + (p - c) * d)
                    Console.WriteLine(a*p);
                else
                    Console.WriteLine(b+(p-c)*d);
            }
            else
            {
                if(a*p <= b)
                    Console.WriteLine(a*p);
                else
                    Console.WriteLine(b);
            }
        }
    }
}
