package yhummyChild;
import java.util.Scanner;

public class Day16_Java_Substring_Comparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        int lastIndex = s.length()-k;
        String terkecil = s.substring(0,k);
        String terbesar = s.substring(0,k);
        for(int i=0;i<=lastIndex;i++){
            String sub = s.substring(i, i+k);
            System.out.println(sub);
            if(terkecil.compareTo(sub)>0){
                terkecil = sub ;
            }
            if(terbesar.compareTo(sub)<0){
                terbesar = sub ;
            }
        }
        System.out.println(terkecil);
        System.out.println(terbesar);
        scan.close();

    }
}

