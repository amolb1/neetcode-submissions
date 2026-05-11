class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        int[] data = new int[s.length()];
        List<String> li = new ArrayList<>();

        for(int i=0;i<s.length();i++){

           li.add(String.valueOf(s.charAt(i)));
        } 


        for(int j=0;j<t.length();j++){
           li.remove(String.valueOf(t.charAt(j)));
        } 

        return li.size()==0;

    }
}
