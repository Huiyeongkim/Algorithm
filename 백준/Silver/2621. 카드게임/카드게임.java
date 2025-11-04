import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        String[] c = {"R", "B", "Y", "G"};
        int k = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, TreeSet<Integer>> map = new HashMap<>();
        Map<Integer, Integer> count = new TreeMap<>();
        while (k < 4) {
            map.put(c[k++], new TreeSet<>());
        }


        for (int i=0; i<5; i++) {
            String[] s = br.readLine().split(" ");
            String color = s[0];
            int num = Integer.parseInt(s[1]);

            map.get(color).add(num);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        k = 0;
        while (k < 4) {
            if (map.get(c[k]).size() == 5) {
                int temp = -1;
                boolean b = true;

                for (int i : map.get(c[k])) {
                    if (temp != -1 && temp+1 != i) {
                        b = false;
                        break;
                    }
                    temp = i;
                }
                if (b) {
                    System.out.println(900 + map.get(c[k]).last());
                    return;
                } else if (!b) {
                    System.out.println(600 + map.get(c[k]).last());
                    return;
                }
            }
            else
                k++;
        }

        for (int i : count.keySet()) {
            if (count.get(i) == 4) {
                System.out.println(800 + i);
                return;
            }
        }

        if (count.size() == 2) {
            int sum = 0;
            for (int i : count.keySet()) {
                if (count.get(i) == 3) {
                    sum += 10 * i;
                }
                else if (count.get(i) == 2) sum += i;
            }
            if (sum != 0) {
                System.out.println(700 + sum);
                return;
            }
        }

        int temp = -1;
        int max = Integer.MIN_VALUE;
        boolean b = true;
        for (int i : count.keySet()) {
            if (temp == -1) temp = i;
            else {
                if (temp+1 == i) temp = i;
                else b = false;
            }
            max = Math.max(i, max);
        }

        if (b && count.size() == 5) {
            System.out.println(500 +max);
            return;
        }

        for (int i : count.keySet()) {
            if (count.get(i) == 3) {
                System.out.println(400 + i);
                return;
            }
        }
        temp = -1;
        for (int i : count.keySet()) {
            if (count.get(i) == 2) {
                if (temp == -1) {
                    temp = i;
                }
                else {
                    if (temp > i) System.out.println(300 + temp * 10 + i);
                    else System.out.println(300 + i * 10 + temp);
                    return;
                }
            }
        }

        for (int i : count.keySet()) {
            if (count.get(i) == 2) {
                System.out.println(200 + i);
                return;
            }
        }

        max = 0;
        for (int i : count.keySet()) {
            max = Math.max(i, max);
        }
        System.out.println(max + 100);
    }
}