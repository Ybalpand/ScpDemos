package demo;

public class Test {

    int i[] = { 0 };
    
    String args[] = { "1", "2" };

    public static void main(String args[]) {
        int i[] = { 1 };
        alter(i);
        System.out.println(i[0]);  //1
        
        if(args.length >0) {
        	System.out.println(args.length); //The program compiles but prints nothing.
        }
    }

    public static void alter(int i[]) {
        int j[] = { 2 };
        i = j;
    }
}
