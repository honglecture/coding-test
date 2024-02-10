// https://www.acmicpc.net/problem/28927
// Киноманы
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int[] array = {3, 20, 120};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]) * array[i];
            int n2 = Integer.parseInt(sArray2[i]) * array[i];
            sum1 += n1;
            sum2 += n2;
        }
        if(sum1 > sum2){
            System.out.println("Max");
        } else if(sum1 < sum2){
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
        bw.flush();
        bw.close();
    }

  
}
