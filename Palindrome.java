import java.util.Scanner;
public class Palindrome {

	static int reverse(int num) {
		 int temp = 0;
		 while(num > 0) {
			 temp = temp*10 + num%10;
			 num /= 10;
		 }
		 return temp;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner arif = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = arif.nextInt(); 
		int temp = reverse(number);
		
		if(number == temp)
			System.out.println(number+ " is palindrome");
		else 
			System.out.println(number+ " is not palindrome");
		
		arif.close();
	}

}
