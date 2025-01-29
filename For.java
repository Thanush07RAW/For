import java.util.Scanner;

public class For {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=1;
		for(int i=1;i<=x;i++) {
			y*=i;
		}
		System.out.print("Factorial of the number "+x+" is :"+y);

	}

}

