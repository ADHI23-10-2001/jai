class Product
{
    public static void main(String[] args)
    {
      System.out.println("Product Details");
      String productName="Laptop";
      String brand="Dell";
      String p_Code="#123AA";
      
      int P_Price=69999;
      int P_Quantity=2;
      int Total=P_Price*P_Quantity;
      
      System.out.println("Product Name: "+productName);
      System.out.println("Product Brand: "+brand);
      System.out.println("Product Code:"+p_Code);
      System.out.println("Product Price:"+P_Price);
      System.out.println("Product Quantity:"+P_Quantity);
      System.out.println("Product Total:"+Total);
      
      double discount;
  
      int total=P_Price*P_Quantity;
	
      if(total>=100000)
      {
	     discount=(50*total)/100;
      }
      else if(total>=80000)
      {
	    discount=(40*total)/100; 
      }
      else if(total>=70000)
      {
	    discount=(30*total)/100;  
      }
      else if(total>=60000)
      {
	    discount=(20*total)/100;  
      }
      else
      {
	    discount=(10*total)/100; 
      }
	System.out.println("Amount to be paid: "+(total-discount));
    }

}