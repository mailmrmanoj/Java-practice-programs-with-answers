public class Thirteen
{
    public static void main(String[] args) {

        int i=0;
        int j= ++i + --i + ++i + i + --i +
                i + --i + i + ++i
                ++i + --i + i + --i +
                i + --i + i;
        System.out.println(i);
        System.out.println(j);
    }
}



/*------Output------*/
/*

Main.java:16: error: ';' expected
	           ++i + --i + i + --i +
	             ^
Main.java:17: error: not a statement
	           i + --i + i;
	                   ^

*/
