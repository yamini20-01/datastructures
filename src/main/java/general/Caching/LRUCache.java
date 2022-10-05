package general.Caching;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache  {
    LinkedList<Integer> cache = new LinkedList<>();
    int capacity = 3;

    public void put(Integer no) { //3,1,4 -> 5
        if (cache.contains(no)) {
            cache.remove(no);
            cache.addFirst(no);
        } else {
            if (cache.size() == capacity) {
                cache.removeLast();
                cache.addFirst(no);
            } else {
                cache.addFirst(no);
            }
        }
    }

    public void get(Integer no) {
        if (cache.contains(no)) {
            cache.remove(no);
        }
        cache.addFirst(no);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();
        lruCache.get(new Integer(2));
        lruCache.get(new Integer(1));
        lruCache.get(new Integer(3));
        lruCache.get(new Integer(4));
        lruCache.get(new Integer(2));
        System.out.println(lruCache.cache);
    }

}
