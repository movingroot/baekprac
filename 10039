namespace baek
{
    class Program
    {        
        static void Main(string[] args)
        {
            int[] score = new int[5]
            {
                int.Parse(Console.ReadLine()),
                int.Parse(Console.ReadLine()),
                int.Parse(Console.ReadLine()),
                int.Parse(Console.ReadLine()),
                int.Parse(Console.ReadLine())
            };
            int sum = 0;

            for(int i = 0; i < 5; i++)
            {
                if(score[i] < 40)
                {
                    sum += 40;
                }
                else
                {
                    sum += score[i];
                }
            }

            Console.WriteLine(sum/5);
        }
    }
}
