package Session4;
import java.util.Random;

public class RandomExamples 
{
	public static void main(String[] args)
	{
		//generate a random number between 1 and 10
		
		Random r=new Random();   //Random is a class like scanner. Scanner is Class and in is an object
		int num= r.nextInt(10)+1; //+1 is to generate 1-10	
		int m= r.nextInt(1,11); //similar(another version of the previous one) (1-10 because 11 is exclusive)
		System.out.println(num);
		
		int x=9,y=8;
		char 1='a',a2='b';
		String n1="Kate", n2="kate";
		System.out.println(num);
		
		//if(n1.equals(n2))  //compare strings
		
	
	}
	
}
