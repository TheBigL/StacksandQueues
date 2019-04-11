import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        //The Recursive Way to Do the Hanoi Tower problem
        int numberOfMoves;
        Tower t1 = new Tower();
        t1.name = "Tower 1";

        Tower t2 = new Tower();
        t2.name = "Tower 2";

        Tower t3 = new Tower();
        t3.name = "Tower 3";

        int numberOfDisks = 12;

        for(int disk = numberOfDisks - 1; disk >= 0; disk--)
        {
            t1.add(disk);
        }
        t1.print();
        t1.moveDisks(numberOfDisks, t2, t3);
        //moveDisksIteratively(numberOfDisks, t1, t2, t3);

        t2.print();






    }

    public static void moveDisksIteratively(int quantity, Tower src, Tower des, Tower aux)
    {
        if(quantity <= 0) return;

        int numberOfMoves = (int) Math.pow(2, (quantity - 1));

        for(int i = 1; i < numberOfMoves; i++)
        {
            if(i % 3 == 1)
            {
                src.moveDisks(quantity, src, des);
            }

            else if(i % 3 == 2)
            {
                src.moveDisks(quantity, src, aux);
            }

            else if (i % 3 == 0)
            {
                src.moveDisks(quantity, aux, des);
            }

        }
    }
}
