package lesson3;

public class List {
    // односвязный список - хранит значение и ссылку на следующий элемент
    Node head; // описывает начало списка

    // сложность перебора O(n)
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
    }
}
