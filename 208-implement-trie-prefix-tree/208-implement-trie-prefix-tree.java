class TrieNode{
    public TrieNode[] children= new TrieNode[26];
   // public char val;
    public boolean isWord;
    //public TrieNode() {}
    //TrieNode(char c){
      //  TrieNode node= new TrieNode();
       // node.val = c;
   // }
}


class Trie {
private TrieNode root;
    public Trie() {
        root = new TrieNode();
        //root.val = ' ';
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            
            if(curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        
        for(char c: word.toCharArray()){
            if(curr.children[c-'a']==null)
                return false;
            curr=curr.children[c-'a'];
        }
        
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        
        TrieNode curr= root;
        
        for( char c: prefix.toCharArray()){
            if(curr.children[c-'a']==null)
                return false;
            
            curr= curr.children[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */