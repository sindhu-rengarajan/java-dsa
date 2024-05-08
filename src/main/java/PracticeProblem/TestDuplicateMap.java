package PracticeProblem;

import java.util.HashMap;
import java.util.Map;

public class TestDuplicateMap {

	public static void dupsString(String str){
        Map<Character,Integer> count = new HashMap<>();
        for(int i =0;i<str.length();i++){
            if(count.containsKey(str.charAt(i))){
            count.put(str.charAt(i),count.get(str.charAt(i))+1);
            }
            else
            count.put(str.charAt(i),1);
            
        }
        
        for(Map.Entry<Character,Integer> e: count.entrySet()){
            if(e.getValue()==1){
                System.out.print(e.getKey());
            }
        }
        
    }
    public static void main(String[] args) {
        String str = "zvvo";
        dupsString(str);
    }
}
