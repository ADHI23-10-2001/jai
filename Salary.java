class Salary
{
    public static void main(String[] args)
    {
	int salary=80000;
	int num1=((40*80000)/100);
	int num2=((20*80000)/100);
	int remaning_salary=(salary-(num1+num2));

		System.out.println("Total salary:"+salary);
		System.out.println("Needs Cutoff:"+num1);
		System.out.println("Rents Cutoff:"+num2);
		System.out.println("Balance Amount:"+remaning_salary);
    }
}