public class Stack
{

    private static class Node
    {
        private int data;
        private Node next;

        private Node(int data)
        {
            this.data = data;
        }

    }

    private Node top;

    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new NullPointerException("Your stack is empty. You need to enter a number before you can even peek at what's inside.");
        }
        return top.data;
    }

    public void add(int data)
    {

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new NullPointerException("Your stack is empty, don't try to delete anything until you add something to the stack");
        }

        int data = top.data;
        top = top.next;
        return data;
    }



}
