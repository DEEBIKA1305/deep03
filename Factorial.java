package numberbased;
import java.util.*;
public class Factorial {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to be factorial:");
	int n=s.nextInt();
	int fact=1;
	for(int i=2;i<=n;i++){
		fact=fact*i;
	}
	System.out.println(fact);
}
}
