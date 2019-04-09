import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        //The Recursive Way to Do the Hanoi
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
        t2.print();






    }

    public static void moveTowers(int disks, Stack<Integer> src, Stack<Integer> des, Stack<Integer> aux)
    {
        int i = 0, moves = 0;

        if(disks % 2 == 0)
        {

        }

        for(i = disks; i < moves; i--)
        {
            src.push(i);
        }

    }
}
