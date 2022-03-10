package yhummyChild;
import java.util.Scanner;
import java.util.regex.*;


public class Day20_Pattern_Syntax_Checker {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String patternIn = in.nextLine();
          	//Write your code
              try{
                  Pattern.compile(patternIn);
                  System.out.println("Valid");
              }catch(PatternSyntaxException ex){
                  System.out.println("Invalid");
              }		
               testCases--;
        }
    }
}

