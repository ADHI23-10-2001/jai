class Health
{
 public static void main(String args[])
 {
	String Health="Excellent",area="City",gender="male";
	int amount=100000,age=30,premium=0,permium_amount=0;
	if(age>=25&&age<=35)
	{
		if(Health=="Excellent")
		{
			if(area=="city")
			{
				if(gender=="male")
				{
					if(amount<=200000)
					{
						premium=4;
						premium_amount=(premium*amount);
						System.out.println(premium_amount);
					}
					else
					{
						System.out.println("Not eligable");
					}
				}
				else
				{
					if(amount<=100000)
					{
						premium=3;
						premium_amount=(premium*amount);
						System.out.println(premium_amount);
					}
					else
					{
						System.out.println("Not eligable");
					}
				}
			}
			else
			{
				System.out.println("Not eligable");
			}
		}
		
		else if(Health=="Poor")
		{
			if(area=="village")
			{
				if(gender=="male")
				{
					if(amount<=10000)
					{
						premium=6;
						premium amount=(premium*amount);
						System.out.println(premium_amount);
					}
					else
					{
						System.out.println(premium_amount);
					}
				}
				else
				{
					System.out.println("Not eligable");
				}
			}
			else
			{
				System.out.println("Not eligable");
			}
		}
		else
		{
			System.out.println("Not eligable");
		}
	}
	else
	{
		System.out.println("Not eligable");
	}
 }
}