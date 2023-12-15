class Library
{
public static void main(String args[])
 {
    System.out.println("LIBRARY APPLICATION");
    String book="Book of D.S",dept_of_book="CSE",date_of_bookissued="10/11/2023";
    int book_quantity=1;
    int book_price=2999,no_of_days=15;

	System.out.println("Name of the book :"+book);
	System.out.println("Department :"+dept_of_book);
	System.out.println("Quantity :"+book_quantity);
	System.out.println(no_of_days+"days");
	System.out.println("Date of book issued :"+date_of_bookissued);


     if(no_of_days<=3)
     {
	System.out.println("No fine");
     }
     else if(no_of_days>3 && no_of_days<=10)
     {
	System.out.println("Collect Ammount:"+(no_of_days-3)*10);
     }
     else if(no_of_days>3 && no_of_days<=30)
     {
	System.out.println("Collect Ammount:"+(no_of_days-3)*100);
     }
     else
     {
	System.out.println("Collect Ammount:"+book_price);
     }
 }
}