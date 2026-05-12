class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.length()!=t.length()){
        return false;
       }
       
       int[] vals = new int[26];
       s = s.toLowerCase();
       t = t.toLowerCase();

       for(int i=0;i<s.length();i++){

        vals[s.charAt(i)-'a']=vals[s.charAt(i)-'a']+1;
        vals[t.charAt(i)-'a']=vals[t.charAt(i)-'a']-1;

       }

       for(int k=0;k<vals.length;k++) {
        if(vals[k]!=0){
            return false;
        }
       }
       return true;
        

    }
}
