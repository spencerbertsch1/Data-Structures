
public class PowerCode {

	// base to the power
	public static double raiseToPower(double base, double power){
		
		if(power == 0){
			return 1; 
		}
		else if(power < 0){
			//int sign_flag = -1; 
			// base * base to the power-1
			return base * raiseToPower(base, power - 1);
		
		}
		else
		{
			// base * base to the power-1
			return base * raiseToPower(base, power - 1);
		}
	
    /* if(sign_flag == -1){
	 * return (1/x)
	 * }else{
	 * return (x) 
	 */
		
		
	}
	
	public static int powerFast(int base, int power){
		
		if (power == 0){
			return 0; 
		}else if (power == 1){
			return base; 
		}else if (power == 2) {
			return base*base; 
		}
		// if POWER IS ODD, 3 or above
		else if (power %2 == 1)
		{
			//x times code for even exponent 
			power = power/2; 
			return base * powerFast(powerFast(base, power), 2); 
		}	
		// if POWER IS EVEN, 4 or above
		else //if (power %2 == 0)
		{
			power = power/2; 
			int temp = powerFast(base, power);
			return powerFast(temp, 2);

		}	
	}
	
	public static void main(String [] args)
	{
		double b1 = 2.0; //declare the base
		double p1 = 5.0; //declare power we want to raise to 
		double x = 0.0; 
		x = raiseToPower(b1, p1); 
		System.out.println("We can see that " + b1 + " raised to the power of " + p1 + " is: " + x); 
		System.out.println("");
		
		int b2 = 2; //declare the base
		int p2 = 7; //declare power we want to raise to 
		int x2 = 0; 
		x2 = powerFast(b2, p2); 
		System.out.println("We can see that " + b2 + " raised to the power of " + p2 + " is: " + x2); 
	
	}
	
}



