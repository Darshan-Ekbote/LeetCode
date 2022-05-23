class Node {
  int value;
  int key;
  Node prev;
  Node next;
  public Node() {}

  public Node(int key, int value) {
    this.key = key;
    this.value = value;
    this.prev = null;
    this.next = null;
  }
}

class DoublyLinkedList {
  Node head;
  Node tail;
  
  public DoublyLinkedList() {
    head = new Node();
    tail = new Node();
    this.head.next = this.tail;
    this.tail.prev = head;
  }
  
  public void insertHead(Node n) {
    n.prev = head;
    n.next = head.next;
    head.next.prev = n;
    head.next = n;    
  }
  
  public void remove(Node n) {
    n.prev.next = n.next;
    n.next.prev = n.prev;
  }
  
  public int removeTail() {
    Node n = tail.prev;
    int key = n.key;
    remove(n);
    
    return key;
  }
}

class LRUCache {
  Map<Integer,Node> cache;
  DoublyLinkedList list;
  int capacity;
  
  public LRUCache(int capacity) {
    this.capacity = capacity;
    this.cache = new HashMap<>();
    this.list = new DoublyLinkedList();
  }
  
  public int get(int key) {
    if (!cache.containsKey(key)) 
        return -1;    
    update(key, cache.get(key));
      
    return cache.get(key).value;
  }
  
  public void put(int key, int value) {
    Node n = new Node(key, value);
      
    if (cache.containsKey(key))
      list.remove(cache.get(key));
    else if (cache.size() >= capacity) {
        int k = list.removeTail();
        cache.remove(k);
    }
        
    list.insertHead(n);
    cache.put(key, n);
  }
  
  private void update(int key, Node n) {    
    list.remove(n);
    list.insertHead(n);
    cache.put(key, n);
  }
}