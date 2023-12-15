class Profitloss
{
 public static void main(String args[])
 {
  int cp=1000,sp=1200;
  if(sp>=cp)
  {
    System.out.println("Profit");
    System.out.println("Profit gain:"+(sp-cp));
  }
  else if(sp<=cp)
  {
    System.out.println("Loss");
    System.out.println("Loss obtained:"+(sp-cp)); 
  }
  else
  {
    System.out.println("No loss and No gain:"+(sp==cp));
  }
  
 }
}