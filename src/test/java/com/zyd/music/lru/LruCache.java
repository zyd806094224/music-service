package com.zyd.music.lru;

import java.util.HashMap;

public class LruCache {

    private int capacity;
    private HashMap<Integer, LruNode> cache;
    private LruNode first;
    private LruNode last;

    public LruCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
    }


    public int get(int key) {
        LruNode res = cache.get(key);
        if (null == res) {
            return -1;
        }
        moveNodeToFirst(res);
        return res.val;
    }

    private void moveNodeToFirst(LruNode node) {
        if (first == node) return;
        if (node.pre != null) {
            node.pre.next = node.next;
        }
        if (node.next != null) {
            node.next.pre = node.pre;
        }
        if (node == last) {
            last = last.pre;
        }
        if (last == null) {
            last = first = node;
            return;
        }
        node.next = first;
        first.pre = node;
        node.pre = null;
        first = node;

    }

    public void put(int key, int value) {
        LruNode temp = cache.get(key);
        if (null == temp) {
            if (cache.size() >= capacity) {
                removeLastNode();
            }
            temp = new LruNode();
            temp.key = key;
        }
        temp.val = value;
        moveNodeToFirst(temp);
        cache.put(key, temp);
    }

    private void removeLastNode() {
        LruNode temp = last;
        last = last.pre;
        if (last != null) {
            last.next = null;
        } else {
            first = last = null;
        }
        cache.remove(temp.key);
    }

}

class LruNode {
    LruNode pre;
    LruNode next;
    int key;
    int val;
}
