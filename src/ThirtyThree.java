public class ThirtyThree
{
    public static void main(String[] args) {
        int i=0;
        if((++i == 1) && (i += 2)){
            System.out.println("from if");
            i++;
        }
        System.out.println("end of main");
        System.out.println(i);

    }
}

/*------Output------*/
/*

Main.java:13: error: bad operand types for binary operator '&&'
        if((++i == 1) && (i += 2)){
                      ^
  first type:  boolean
  second type: int
1 error

*/
