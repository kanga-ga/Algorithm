class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int len1 = my_string.length();
        int len2 = overwrite_string.length();
        String str1 = my_string.substring(0,s);
        String str2 = overwrite_string + my_string.substring(s+len2,len1) ;
        answer = str1 +str2;
        
        return answer;
    }
}