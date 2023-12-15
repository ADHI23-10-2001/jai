class Scholarship
{
public static void main(String args[])
{
  System.out.println("STUDENT SCHOLARSHIP");
  String college="JNTUH",course="Engineering",branch="MECH";
  int no_of_years=4,emcet_rank=800,fee=1000000,scholarship=(fee*50/100);

  if(course=="Engineering")
  {
    if(no_of_years==4)
    {
      if(emcet_rank>=1&&emcet_rank<=100)
      {
	if(branch=="CSE")
	{
	  System.out.println("Congratulations");
	  System.out.println("Scholarship:"+scholarship);
	}
	else
	{
	  System.out.println("Sorry your not Eligable");
	}
      }
      else if(emcet_rank>=101&&emcet_rank<=500) 
      { 
        if(branch=="IT")
	{
	  System.out.println("Congratulations");
	  System.out.println("Scholarship:"+(fee*40/100));
	}
	else
	{
	  System.out.println("Sorry your not Eligable");
	}
      }

      else if(emcet_rank>=501&&emcet_rank<=750) 
      { 
        if(branch=="ECE")
	{
	  System.out.println("Congratulations");
	  System.out.println("Scholarship:"+(fee*30/100));
	}
	else
	{
	  System.out.println("Sorry your not Eligable");
        }
      }
    

     else if(emcet_rank>=751&&emcet_rank<=1000) 
     { 
        if(branch=="MECH")
	{
	  System.out.println("Congratulations");
	  System.out.println("Scholarship:"+(fee*20/100));
	}
	else
	{
	  System.out.println("Sorry your not Eligable");
	}
    }
    
    else
    {
         System.out.println("your elgable to civil");
    }

  }

 }

}
}