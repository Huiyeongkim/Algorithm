import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        double a = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sub = st.nextToken();
        double gra = Double.parseDouble(st.nextToken());
            String rat = st.nextToken();
            double b = 0;
            switch(rat) {
                case "A+":
                    b = 4.5;
                    break;
                case "A0" :
                    b = 4.0;
                    break;
                case "B+":
                    b = 3.5;
                    break;
                case "B0" :
                    b = 3.0;
                    break;
                case "C+":
                    b = 2.5;
                    break;
                case "C0":
                    b = 2.0;
                    break;
                case "D+":
                    b = 1.5;
                    break;
                case "D0":
                    b = 1.0;
                    break;
                case "F":
                    b = 0;
                    break;
                case "P" :
                    b = 0;
                    gra = 0;
                    break;
            }
            sum += gra;
            a += gra*b;
        }
        double result = a/sum;
        System.out.printf("%.6f",result);
    }
}