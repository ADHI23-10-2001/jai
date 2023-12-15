class LargeNumber
{
public static void main(String args[])
 {
   int a=10,b=200,c=30;

   System.out.println("Before swapping a :"+a);
   System.out.println("Before swapping b :"+b);
   System.out.println("Before swapping c :"+c);

   a=a+b+c;
   c=a-(b+c);
   b=a-(b+cS);
   a=a-(b+c);

   System.out.println("After swapping a :"+a);
   System.out.println("After swapping b :"+b);
   System.out.println("After swapping c :"+c);

   
 }
}
