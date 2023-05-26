package lesson3;

public class Seminar3 {
    // реализуем простой односвязный список.
    // пишем только структуру без методов.
    private Node head;
    private class Node {
        private int value;
        private Node next;
    }

    // реализуем метод добавления новых элементов в начало списка.
    public void addFirst(int value) {
        Node first = new Node();
        first.value = value;
        if (head != null) {
            first.next = head;
        }
        head = first;
    }

    // реализуем метод удаления первого элемента связанного списка.
    public void deleteFirst(){
        if(head != null){
            head = head.next;
        }
    }

    // реализуем метод поиска элемента в односвязном спиcке
    // возвращать будем boolean

    public boolean ifFind(int value){
        Node item = head;
        while (item != null){
            if(item.value == value){
                return true;
            }
            item = item.next;
        }
        return false;
    }
}