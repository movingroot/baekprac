namespace baek
{
    class Program
    {        
        static void Main(string[] args)
        {
            int input = int.Parse(Console.ReadLine());
            int factorialResult = 1;

            for(int i = input; i > 0; i--)
            {
                factorialResult *= i;
            }
            Console.WriteLine(factorialResult);
        }
    }
}
