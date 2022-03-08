package yhummyChild;
import java.util.Scanner;
        
public class Day18_Java_Anagrams {
    public static void main(String[] args) {
        // Complete the function
        boolean result = true;
        if(a==null||b==null||a.equals("")||b.equals("")){
            throw new IllegalArgumentException();
        }
        if(a.length()!=b.length()){
            result = false;   
        }else{
            a = a.toLowerCase();
            b = b.toLowerCase();
            
            java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();           
            java.util.Map<Character, Integer> mapB = new java.util.HashMap<>();
            
            //hitung frekuensi
            for(int i=0;i<a.length();i++){
                char charA = a.charAt(i);
                char charB = b.charAt(i);
                
                //untuk karakter A
                if(!mapA.containsKey(charA)){
                    mapA.put(charA, 1);
                }else{
                    Integer frekuensi = mapA.get(charA);
                    mapA.put(charA, ++frekuensi);
                }
                
                //untuk karakter B
                if(!mapB.containsKey(charB)){
                    mapB.put(charB, 1);
                }else{
                    Integer frekuensi = mapB.get(charB);
                    mapB.put(charB, ++frekuensi);
                }
            }
            
            //Bandingkan karakter dan frekkuensi di mapA dan di mapB
            for(java.util.Map.Entry<Character, Integer> elemenA : mapA.entrySet()){
                char keyA = elemenA.getKey();
                int valueA = elemenA.getValue();
                if(!mapB.containsKey(keyA)){
                    result = false;
                    break;
                }else{
                    int valueB = mapB.get(keyA);
                    if(valueA != valueB){
                        result = false;
                        break;
                    }
                }
            }
            
        }
        return result;
    }
    }
}
