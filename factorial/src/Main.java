public class Main {
    public static int fact(int n)
    {
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args)
    {
        int x=6;
        int result=0;
        result= fact(x);
        System.out.println(result);
    }

}