public class TwentyNine
{
    public static void main(String[] args) {
        int i=93;
        if((i++ = 5) && (i++ ==1)){
            System.out.println("from if");
            i++;
        }
        System.out.println("end of main");
        System.out.println(i);

    }
}

/*------Output------*/
/*

Main.java:13: error: unexpected type
        if((i++ = 5) && (i++ ==1)){
             ^
  required: variable
  found:    value
1 error

*/
