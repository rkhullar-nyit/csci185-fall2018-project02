public class LinkedListDemo
{
    /**
     * In this example we are manually created a linked list with two integer items.
     * The final list can be interpreted as follows:
     *
     * (4)<->(6)
     *
     * [4, 6]
     */
    static void demo1()
    {
        // allocate space for the list nodes
        LinkedListNode<Integer> nodes[] = new LinkedListNode[2];

        // initialize nodes with values
        nodes[0] = new LinkedListNode<>(4);
        nodes[1] = new LinkedListNode<>(6);

        // link nodes together
        nodes[0].next = nodes[1];
        nodes[1].prev = nodes[0];
    }

    /**
     * In this example we use our linked list api to add and remove character values.
     * The comments on the right hand side show the state of the list after each operation.
     */
    static void demo2()
    {
        LinkedList<Character> list = new LinkedList<>();             // []
        System.out.println(list);

        list.addHead('A');                                     // [A]
        list.addTail('B');                                     // [A, B]
        list.addTail('C');                                     // [A, B, C]
        list.addHead('X');                                     // [X, A, B, C]
        System.out.println(list);

        char c = list.delTail();                                     // [X, A, B]
        System.out.printf("deleted value <%s> should be C\n", c);

        char x = list.delHead();                                     // [A, B]
        System.out.printf("deleted value <%s> should be X\n", x);
        System.out.println(list);
    }

    public static void main(String[] args)
    {
        demo1();
        demo2();
    }
}
