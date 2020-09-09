package test;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClasses {
    public static void main(String args[] ) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();                // Reading input from STDIN // Writing output to STDOUT
        String t = br.readLine();                // Reading input from STDIN

        s=s.toLowerCase();
        t = t.toLowerCase();
        int len1= s.length();
        int len2 = t.length();
    	List<String> s1 = new ArrayList<String>();
    	List<String> s2 = new ArrayList<String>();
        for(int i=0; i<len1; i++){
        	String a = s.substring(i, len1);
        	String b = s.substring(0, i);
        	s1.add(a);
        	s1.add(b);
        }

        for(int i=0; i<len2; i++){
        	String a = t.substring(i, len2);
        	String b = t.substring(0, i);
        	s2.add(a);
        	s2.add(b);
        }
        for(int j = 0; j< len1; j++){
        	String a = s1.get(j);
        	System.out.println(a);
        	String b = s2.get(j);
        	System.out.println(b);
        	if(a.equals(b)){
        		System.out.println(a.length());
        	}
        }
       
        /*/Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        

    }
}
