class Mymarks2
{
    public static void main(String[] args)
    {
      System.out.println("Student Application");
      String S_Name="Sai";
      int S_age=20;
      char section='A';
      String Gender="Male";
      	int m1=90,m2=80,m3=76,m4=70,m5=88,m6=50;
	int total=m1+m2+m3+m4+m5+m6;
		System.out.println("S_Name:"+S_Name);
		System.out.println("S_age:"+S_age);
     		System.out.println("Section:"+section);
		System.out.println("Gender:"+Gender);
		System.out.println("Total:"+total);
		
      if(total>=500)
	{
	 System.out.println("Grade:A+");
	}
      else if(total>=400)
	{
	    System.out.println("Grade:A"); 
	}
      else if(total>=300)
	{
	    System.out.println("Grade:B"); 
	}
      else if(total>=200)
	{
	    System.out.println("Grade:c"); 
	}
      else
        {
            System.out.println("Grade:F");
        }
    }

}