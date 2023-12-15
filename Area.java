class Area
{
   public static void main(String[] args)
   {
    
	int l=40,b=30,r=5; 
	int Area_of_rect=l*b;
	int Perimeter_of_rect=2*(l+b);
	double Area_cir=(Math.PI)*(r*r);
	int Area_cir2=(int)((Math.PI)*(r*r));
	double Circumference_cir=2*(Math.PI)*r;
	int Circumference_cir2=(int)(2*(Math.PI)*r);

		System.out.println(Area_of_rect+" is Area_of_rect");
		System.out.println(Perimeter_of_rect+" is Perimeter_of_rect");
		System.out.println(Area_cir2+" is Area_of_cir");
		System.out.println(Circumference_cir2+" is Circumference_of_cir");
    }
}