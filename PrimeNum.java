package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num = 13; 
		int i, count=0;
      
				
       for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
      
        if(count == 0)
        {
            System.out.print(num + ":This is a Prime Number");
        }
        else
        {
            System.out.print(num + ":This is not a Prime Number");
        }
    }

}
	
}