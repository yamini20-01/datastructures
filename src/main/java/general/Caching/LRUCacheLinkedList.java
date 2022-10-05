package general.Caching;

import java.util.LinkedList;

public class LRUCacheLinkedList {
    int capacity;
    LinkedList<String> cache;

    public LRUCacheLinkedList(int capacity) {
        this.capacity = capacity;
        cache = new LinkedList<String>();

    }


    public String refer(String str) {
        if (!cache.contains(str)) {
            if (cache.size() == capacity) {
                //remove last element
                cache.removeLast();
            }
            cache.addFirst(str);
        } else {
            cache.remove(str);
            cache.addFirst(str);
        }

        return str;
    }

    public static void main(String[] args) {
        LRUCacheLinkedList list = new LRUCacheLinkedList(5);
        list.refer("IphoneX");
        list.refer("iphone11");
        list.refer("iphone12");
        list.refer("iphone13");
        list.refer("iphone11");
        list.refer("iphone10");
        list.refer("iphone13");
        list.refer("iphone14");
        System.out.println(list.cache);


    }


}
