public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(8);
        list.insert(9);
        list.insert(1);
        list.insert(5);
        list.insert(54);
        list.insert(45);
        list.insert(34);
        list.delete(8);
        list.delete(54);
        list.delete(34);
        list.display();
    }
}