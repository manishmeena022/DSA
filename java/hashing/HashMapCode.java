package java.hashing;

import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int size;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){

        }

        public void put(K key, V value){

        }

        public boolean containsKey(K key){
            return false;
        }

        public V remove(K key){

        }
    }
}
