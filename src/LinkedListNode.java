class LinkedListNode<T>
{
    private T data;
    protected LinkedListNode<T> prev, next;

    public LinkedListNode(T data)
    {
        // your code here
    }

    public T getData()
    {
        // your code here
        return null;
    }

    public boolean hasPrev()
    {
        // your code here
        return false;
    }

    public boolean hasNext()
    {
        // your code here
        return false;
    }

    public String toString()
    {
        return String.format("<%s>", data);
    }
}
