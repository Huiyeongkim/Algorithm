import java.util.Scanner;

public class Main {
    static StringBuilder arr;

    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            int N = in.nextInt();
            if (N==-1) break;
            int len = (int) Math.pow(3, N);
            arr = new StringBuilder();

            for (int i = 0; i < len; i++) arr.append("-");
            res(0, len);
            System.out.println(arr);
        }
    }

    public static void res(int start,int size) {
        if(size==1) return;
        int newSize=size/3;

for(int i=start+newSize; i<start+2*newSize; i++) {
			arr.setCharAt(i, ' ');
		}
		        res(start, newSize);
        res(start+2*newSize, newSize);
    }
}