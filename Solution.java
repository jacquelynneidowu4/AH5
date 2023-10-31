import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> map =new HashMap<>();
        char answer='0';
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                answer=entry.getKey();
            }
        }

      
      return answer;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    }

  }
