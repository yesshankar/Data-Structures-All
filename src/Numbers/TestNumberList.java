package Numbers;

/**
 * Created by Shankar on 9/1/2016.
 */

// The test driver for the NumberList ADT implementations

public class TestNumberList {

    public static void main(String[] args) {
        /*NumberList myList1 = new ArrayNumberList(5);
        myList1.insert(100);
        myList1.insert(50);
        myList1.insert(70);
        myList1.insert(23);
        myList1.insert(19);

        System.out.println(myList1);
        System.out.println("Doese 35 exist in the list? " + myList1.contains(35));
        System.out.println("Doese 35 exist in the list? " + myList1.contains(23));
        System.out.println("Is the list full? " + myList1.isFull()); */

        NumberList myList2 = new LinkedNumberList();
        myList2.insert(100);
        myList2.insert(50);
        myList2.insert(70);
        myList2.insert(23);
        myList2.insert(19);

        System.out.println(myList2);
        System.out.println("Doese 35 exist in the list? " + myList2.contains(35));
        System.out.println("Doese 35 exist in the list? " + myList2.contains(23));
        System.out.println("Is the list full? " + myList2.isFull());
    }
}
