import java.util.*;

public class Main {
    static char[][] tree = new char[26][2]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);
            int idx = root - 'A';
            tree[idx][0] = left;
            tree[idx][1] = right;
        }

        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
        System.out.println();
    }

    static void preorder(char node) {
        if (node == '.') return;
        System.out.print(node);
        preorder(tree[node - 'A'][0]);
        preorder(tree[node - 'A'][1]);
    }

    static void inorder(char node) {
        if (node == '.') return;
        inorder(tree[node - 'A'][0]);
        System.out.print(node);
        inorder(tree[node - 'A'][1]);
    }

    static void postorder(char node) {
        if (node == '.') return;
        postorder(tree[node - 'A'][0]);
        postorder(tree[node - 'A'][1]);
        System.out.print(node);
    }
}