public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        //whenever a new LL is created, size=0, head and tail will be initialised 
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        // list.insertLastWTail(76);
        list.insert(100, 3);
        // System.out.println(list.deleteLast());
        list.delete(100);
        list.display();
    }
}
