package lesson4;

import lesson3.List;
import java.util.LinkedList;

public class HashTable<K,V> {
        private static final int init_basket_count = 16;
        private Basket[] baskets;

        public HashTable(){
            this(init_basket_count);
        }
        public HashTable(int initSize){
            baskets = (Basket[]) new Object[initSize];
        }

        private int calculateBasketIndex(K key){
            return key.hashCode()%baskets.length;
        }


        private class Entity{
            private K key;
            private V value;
        }

        private class Basket{
            private Node head;
            private class Node{
                private Node next;
                private Entity value;
            }

            public V getBasket(K key){
                Node item = head;
                while (item != null){
                    if(item.value.key.equals(key)){
                        return item.value.value;
                     }
                    item = item.next;
                }
                return null;
            }

            public V getBasketOut(K key){
               int index = calculateBasketIndex(key);
               Basket basket = baskets[index];
               if (basket != null){
                  return basket.getBasket(key);
               }
               return null;
            }


        }
    }
