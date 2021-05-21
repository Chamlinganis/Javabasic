public class Calculate{
     static int a,b,c,d;
    public static void main(String[] args){
        a=25;
        b=23;
        c=10;
        d=33;
        int s1=((a+b)/(c*d));
        int s2=((c*d)/(b+a));
        int s3=((c%4)+(d/10));
        int s4=(c%(4+d))/10;
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        System.out.println("s3 is "+s3);
        System.out.println("s4 is "+s4);     
    }
}