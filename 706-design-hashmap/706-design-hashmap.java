class Node<U, V> {
  public U first;
  public V second;

  public Node(U first, V second) {
    this.first = first;
    this.second = second;
  }
}


class Bucket {
  private List<Node<Integer, Integer>> bucket;

  public Bucket() {
    this.bucket = new LinkedList<Node<Integer, Integer>>();
  }

  public Integer get(Integer key) {
    for (Node<Integer, Integer> node : this.bucket) {
      if (node.first.equals(key))
        return node.second;
    }
    return -1;
  }

  public void update(Integer key, Integer value) {
    boolean found = false;
    for (Node<Integer, Integer> node : this.bucket) {
      if (node.first.equals(key)) {
        node.second = value;
        found = true;
      }
    }
    if (!found)
      this.bucket.add(new Node<Integer, Integer>(key, value));
  }

  public void remove(Integer key) {
    for (Node<Integer, Integer> node : this.bucket) {
      if (node.first.equals(key)) {
        this.bucket.remove(node);
        break;
      }
    }
  }
}

class MyHashMap {
  private int key_space;
  private List<Bucket> hash_table;

  /** Initialize your data structure here. */
  public MyHashMap() {
      
     // relates to the buckets , keys = number of buckets 
    this.key_space = 2069;
    this.hash_table = new ArrayList<Bucket>();
    for (int i = 0; i < this.key_space; ++i) {
      this.hash_table.add(new Bucket());
    }
  }

  /** value will always be non-negative. */
  public void put(int key, int value) {
    int hash_key = key % this.key_space;
    this.hash_table.get(hash_key).update(key, value);
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
   * for the key
   */
  public int get(int key) {
    int hash_key = key % this.key_space;
    return this.hash_table.get(hash_key).get(key);
  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {
    int hash_key = key % this.key_space;
    this.hash_table.get(hash_key).remove(key);
  }
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj = new MyHashMap();
 * obj.put(key,value); int param_2 = obj.get(key); obj.remove(key);
 */