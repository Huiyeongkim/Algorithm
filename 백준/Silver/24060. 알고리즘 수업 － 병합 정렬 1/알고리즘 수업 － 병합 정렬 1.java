import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;


public class Main {
    static int count;
    static int mycount;
    static int tmp[];
    public static void merge_sort(int A[],int p,int r){
        if(p<r){
            int q=(p+r)/2;
            merge_sort(A,p,q);
            merge_sort(A,q+1,r);
            merge(A,p,q,r);
        }
    }
   public static void merge(int A[],int p,int q,int r){
        int i=p,j=q+1,t=0;
        while(i<=q&&j<=r){
            if(A[i]<=A[j]){
                tmp[t++]=A[i++];
            }
            else{
                tmp[t++]=A[j++];
            }
        }
        while(i<=q){
            tmp[t++]=A[i++];
        }
        while(j<=r){
            tmp[t++]=A[j++];
        }
        i=p;t=0;
        while(i<=r){
            count++;
            A[i++]=tmp[t++];
            if(count==mycount){
                System.out.print(A[i-1]);
            }
        }
   }
    public static void main(String[] args) throws IOException{
         BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         st=new StringTokenizer(br.readLine());
           int n=Integer.parseInt(st.nextToken());
           tmp=new int[n];
         int arr[]=new int[n];
         mycount=Integer.parseInt(st.nextToken());
         st=new StringTokenizer(br.readLine());
         for(int i=0;i<n;i++){
             arr[i]=Integer.parseInt(st.nextToken());
         }
         merge_sort(arr,0,arr.length-1);
         if(count<mycount){
             System.out.print(-1);
         }
    }
}