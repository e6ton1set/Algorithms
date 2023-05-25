package lesson3;

public class List {
    // односвязный список - хранит значение и ссылку на следующий элемент
    Node head; // описывает начало списка
    Node tail; // описывает конец списка

    // метод добавления по двусвязному списку
    public void add(int value){
        Node node = new Node();
        node.value = value;
        if(head==null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }
    public void add (int value, Node node){
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = tail;
        tail = node;
        if (next == null){
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    // метод удаления внутри двусвясного списка
    public void delete (Node node){
        Node previous = node.previous;
        Node next = node.next;

        if (previous == null){
            node.previous = null;
            head = next;
        } else {
            if(next == null){
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    // сложность перебора O(n)
    // метод поиска по дносвязному списку
    public Node find(int value){
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.value == value){
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public class Node{
        int value;
        Node next;
        Node previous;
    }
}
