package numberbased;
import java.util.*;
public class Integerreverse {
	public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter any number:");
int num=s.nextInt();

int n,rev=0,i=0;
while(num>0){
	n=num%10;
	
	rev=rev*10+n;
	i++;
	num=num/10;
}
System.out.println(rev);
}
}
