class Solution {
    public int strStr(String haystack, String needle) {
      // using indexOf()
        if(haystack.equals("") && needle.equals("")){
            return 0;
        }
        int n = -1;
        if(haystack.indexOf(needle) >= 0){
            n = haystack.indexOf(needle);
        }
        return n;
    }
}
