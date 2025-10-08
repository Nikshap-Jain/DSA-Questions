package Tries;

public class TrieDemo {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("app"));      // true
        System.out.println(trie.search("appl"));     // false
        System.out.println(trie.startsWith("ap"));   // true
        System.out.println(trie.startsWith("ba"));   // true
        System.out.println(trie.startsWith("cat"));  // false
    }
}
