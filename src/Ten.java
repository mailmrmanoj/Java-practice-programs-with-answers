public class Ten
{
    public static void main(String[] args) {

        int i=80;
        int j=10;
        int k=i++ + ++i;
        System.out.println(i++ + j++);
        System.out.println(j);
        System.out.println(k);

    }
}

/*------Output------*/
/*

92
11
162


*/
