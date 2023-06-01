package lesson4;

import lesson3.List;

import java.util.LinkedList;

public class HashTable {
    class Hash <K,V>{
        private class Entity{
            private K key;
            private V value;
        }

        private class basket{
            private Node head;
            private class Node{
                private Node next;
                private Entity value;
            }
        }
    }
}
