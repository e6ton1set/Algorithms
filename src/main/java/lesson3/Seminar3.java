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

    // реализуем метод добавления новых элементов в конец списка
    public void addLast(int value){
        Node last = new Node();
        last.value = value;
        if (head == null){
            head = last;
        } else {
            Node item = head;
            while (item.next != null){
                item = item.next;
            }
            item.next = last;
        }
    }

    // реализуем метод удаления последнего элемента из связанного списка
    public void deleteLast(){
        if (head != null){
            Node item = head;
            while (item.next != null){
                if(item.next.next == null){
                    item.next = null;
                    return;
                }
                item = item.next;
            }
            head = null;
        }
    }
}