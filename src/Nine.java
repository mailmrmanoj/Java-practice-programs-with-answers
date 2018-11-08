public class Main
{
    public static void main(String[] args) {

        int i=0;
        int j=10;
        int k=i++ + ++i;
        System.out.println(i++ + j++);
        System.out.println(j);
        System.out.println(k);

    }
}



/*------Output------*/
/*

12
11
2                                                                                                                                       

*/
