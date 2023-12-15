class FizzBuzz
{
    public static void main(String[] args)
    {
      int num=24;
      if(num%2==0)
      {
	if(num%4==0)
	{
	  System.out.println("FizzBuzz");
	}
	else
	{
	  System.out.println("Fizz");
	}
      }
      
      else
      {
	if(num%4==0)
	{
	  System.out.println("Buzz");
	}
	else
	{
	  System.out.println("False");
	}
      }
    }
}