class Exam07 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i < 10; i = i + 1)
        {
            System.out.print(2 * i + " ");
        }
        System.out.println();

        System.out.println("=======================");

        for (int i = 2; i < 10; i = i + 1)
        {
            System.out.print(2 * i + " ");
            System.out.print(3 * i + " ");
            System.out.print(4 * i + " ");
            System.out.print(5 * i + " ");
            System.out.print(6 * i + " ");
            System.out.print(7 * i + " ");
            System.out.print(8 * i + " ");
            System.out.print(9 * i + " ");
            System.out.println();
        }

        System.out.println("=======================");

        for (int i = 2; i < 10; i = i + 1)
        {
            System.out.print(i+"단:");

            for (int j = 2; j < 10; j = j + 1)
            {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}