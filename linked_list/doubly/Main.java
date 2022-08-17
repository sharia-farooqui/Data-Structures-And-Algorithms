public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(12);
        list.insertFirst(17);
        list.insertLast(79);
        list.insert(3, 28);

        list.display();
    }
}
