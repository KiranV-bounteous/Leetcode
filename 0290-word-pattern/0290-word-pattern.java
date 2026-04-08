class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();  
        for (int i = 0; i < pattern.length() ; i++ ) {
            char c = pattern.charAt(i);
            String word = arr[i];
            if(map.containsKey(c)&&!map.get(c).equals(word)||!map.containsKey(c)&&map.values().contains(word)){
                return false;
            }
            map.put(c,word);
        }
    
        return true;
    }
}