package yhummyChild;
import java.io.*;
import java.util.*;

public class Day17_Java_String_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String s = scan.next();
        for(int i=0;i<s.length();i++){
            System.out.println(s.substring(i, i+1));
        }
        scan.close();
    }
}
