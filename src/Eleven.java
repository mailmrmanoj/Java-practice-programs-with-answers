public class Eleven
{
    public static void main(String[] args) {

        int i=5;
        int j=6;
        int k=i++ + ++i + i++ + i--;
        System.out.println(i++ + j++);
        System.out.println(i);
        System.out.println(k);

    }
}


/*------Output------*/
/*

13
8
27

*/
