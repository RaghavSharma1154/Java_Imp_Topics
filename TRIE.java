public class TRIE{
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    //Insertion -->
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    //Search -->
    public static boolean Search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] == null) return false;
            if(i == key.length()-1 && curr.children[idx].eow == false) return false;
            curr = curr.children[idx];
        }
        return true;
    }
    //Qu: Word break problem-->
    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;
        for(int i=1;i<=key.length();i++){
            String first = key.substring(0, i);
            String sec = key.substring(i);
            if(Search(first) && wordBreak(sec)) return true;
        }
        return false;
    }
    //QU : Starts with Problem -->
    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    //QU : Count unique substring -->
    public static int countNodes(Node root){
        if(root == null) return 0;
        int count = 0;
        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    //QU : Longest word with all prefix -->
    public static String ans = "";
    public static void longestWord(Node root,StringBuilder temp){
        if(root == null ) return;
        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        } 
    }
    public static void main(String args[]){
        // String[] words = {""};
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // String key = "man";
        // System.out.println(startsWith(key));
        // String key = "ilikesung";
        // System.out.println(Search("any"));
        // System.out.println(wordBreak(key));

        //Count unique substring-->
        // String str = "ababa";
        // for(int i=0;i<str.length();i++){
        //     String suffix = str.substring(i);
        //     insert(suffix);
        // }
        // System.out.println(countNodes(root));

        //Longest word with all prefix -->
        String[] words = {"a","banana","app","appl","ap","apply"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);
    }
}