
public class BikeInheritance{
   int speed;
   int gear;
   
	protected BikeInheritance(int speed ,int gear ) {
		// TODO Auto-generated constructor stub
	this.speed =speed;
	this.gear=gear;
	
	}
	
	public String overspeed() {
		String a = null;
		
		if(this.speed <90) {
			a="\nChange Your Lane to LIGHT VEHICLE";
		}
		
		else if(this.speed>150   )
		{
		 a="\noverspeeding for a vehicle";
		}
		
		 else 
		 {	 
		a="\n ACCEPTABLE  SPEED FOR VEHICLE ";	 
	}
		
		return a;
		
}
	
	public String toString() {
		
		
		
		return ("Speed of bike is "+this.speed+   "\nGear is "+this.gear);
	}
	
	
	
}
	
 class  MonsterBike extends BikeInheritance{

		int seatHeight;
		
		public MonsterBike(int speed, int gear,int seatHeight) {
			super(speed, gear);
			
			this.seatHeight=seatHeight;
			// TODO Auto-generated constructor stub
		}
		
		public String Sh() {
			return ("\nSeat height is " + this.seatHeight);
		}
		
		public String toString() {
			
			return (super.toString());
			
		}
		
 }



 //Refer decision making for main
	



