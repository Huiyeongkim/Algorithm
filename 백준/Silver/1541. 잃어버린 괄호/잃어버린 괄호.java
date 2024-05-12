import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int sum = Integer.MAX_VALUE;
		String[] str = in.nextLine().split("-");
		
		for(int i = 0; i < str.length; i++) {
			int temp = 0;
			String[] add = str[i].split("\\+");
			
			for(int j = 0; j < add.length; j++) 
                		temp += Integer.parseInt(add[j]);
			
			if (sum == Integer.MAX_VALUE) sum = temp; 
            		else sum -= temp;
		}
		System.out.println(sum);
	}
}
