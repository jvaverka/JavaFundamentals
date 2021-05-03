import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExampleArrayList {
  public static void main(String[] args)  {
    // create empty lists or specify size
    ArrayList<Integer> myList = new ArrayList<>();
    ArrayList<Integer> myList1 = new ArrayList<>(5);

    System.out.println("Size of myList after initialization:  " + myList.size());
    System.out.println("Size of myList1 after initialization: " + myList1.size());

    // add elements to list
    myList.add(10);
    myList.add(20);
    myList.add(30);

    myList1.add(50);
    myList1.add(55);
    myList1.add(60);

    System.out.println("Size of myList after adding elements:  " + myList.size());
    System.out.println("Size of myList1 after adding elements: " + myList1.size());

    // print lists in multiple ways
    System.out.println("myList with standard for loop");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println(myList.get(i));
    }

    System.out.println("myList1 with collection for loop");
    for (int ele : myList1) {
      System.out.println(ele);
    }

    System.out.println("sysout myList");
    System.out.println(myList);

    System.out.println("myList toString");
    System.out.println(myList.toString());

    System.out.println("myList1 with Iterator");
    Iterator<Integer> myListIterator = myList1.iterator();
    while (myListIterator.hasNext()) {
      int i = myListIterator.next();
      System.out.println(i);
    }

    // get elements
    int myElement = myList.get(0);
    System.out.println("First element of myList is: " + myElement);

    // settings elements at specific index
    myList.set(0, 100);
    System.out.println("After resetting first element: " + myList);

    // remove and clear
    myList.remove(0);
    System.out.println("Size of myList after removing first element:  " + myList.size());
    System.out.println("myList:");
    System.out.println(myList.toString());

    myList1.clear();
    System.out.println("Size of myList1 after clearing elements: " + myList1.size());
    System.out.println("myList1:");
    System.out.println(myList1.toString());

    // don't forget about sorting
    ArrayList<Integer> anotherList = new ArrayList<>();
    anotherList.add(20);
    anotherList.add(35);
    anotherList.add(5);

    System.out.println(anotherList);
    System.out.println("sorting...");
    Collections.sort(anotherList);
    System.out.println(anotherList);
  }
}
