public class TwentyThree
{
    public static void main(String[] args) {

        int i = 10;
        if(i = 10){
            System.out.println("from if");
        }
        System.out.println("end of main");
    }
}



/*------Output------*/
/*

Main.java:14: error: incompatible types: int cannot be converted to boolean
	    if(i = 10){
	         ^
1 error
*/
