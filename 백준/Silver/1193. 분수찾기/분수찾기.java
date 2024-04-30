import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	  
		int a = 1;
		int x = in.nextInt();
		int y, i, j;

		while (true) {
			if ((a + 1)*a / 2 >= x) break;
			a++;
		}
	    
	    y = (a - 1) * a / 2;
		i = x - y;
		j = a + 1 - i;

		if (a % 2>0) {
			System.out.print(j+"/");
			System.out.println(i);
		}
		else {
			System.out.print(i+"/");
			System.out.println(j);
		}
	}	
}