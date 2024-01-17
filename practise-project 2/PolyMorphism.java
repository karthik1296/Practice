package Assisted;

class BigNumber
{
	public void Big(int a , int b)
	{
		if(a>b)
			System.out.println(a + " and " + b + " Big Number is " + a );
        else 
        	System.out.println(a + " and " + b + " Big Number is " + b );
			
		}
	public void Big(float a , float b)
	{
		if(a>b)
			System.out.println(a + " and " + b + " Big Number is " + a );
        else 
        	System.out.println(a + " and " + b + " Big Number is " + b );
			
		}

    public void Big(int a , float b)
    {
	if(a>b)
		System.out.println(a + " and " + b + " Big Number is " + a );
    else 
    	System.out.println(a + " and " + b + " Big Number is " + b );
		
	}
}
public class PolyMorphism {

	public static void main(String[] args) {
            BigNumber b = new BigNumber(); 
            b.Big(100,500);
            b.Big(12.0f, 11.0f);
            b.Big(10, 12.0f);
	}

}

