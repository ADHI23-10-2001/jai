class Majorminor
{
    public static void main(String[] args)
    {
     int age=14;
     if(age>18)
     {
	if(age>60)
	{
	  System.out.println("Senior Citizen");
	}

	else
	{
	  System.out.println("Major");
	}
     }
     
     else
     {
	if(age<10)
	{
	  System.out.println("kid");
	}
	
	else
	{
	  System.out.println("Minor");
	}
     }

    }
}