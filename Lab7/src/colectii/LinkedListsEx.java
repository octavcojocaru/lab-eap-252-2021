package colectii;

import java.util.LinkedList;

public class LinkedListsEx {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1000);
        linkedList.addLast(1001);
        linkedList.addFirst(1);
        linkedList.addFirst(0);

        for(int i: linkedList) {
            System.out.print(i + ", ");
        }

        linkedList.getFirst();
        linkedList.getLast();

        linkedList.peekFirst(); // retrieves but does not remove the first element
        linkedList.peekLast();

    }

}
