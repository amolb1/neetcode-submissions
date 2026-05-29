class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

          Map<String,List<String>> maps = Arrays.stream(strs).collect(Collectors.groupingBy(e-> Arrays.
                stream(e.split("")).sorted().collect(Collectors.joining()) ));
        List<List<String>> li = new ArrayList<>();
        for(Map.Entry<String,List<String>> data: maps.entrySet()) {
            li.add(data.getValue());
        }


        return li;
        
    }
}
