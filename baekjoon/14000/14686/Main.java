// https://www.acmicpc.net/problem/14686
// Sum Game
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int sum1 = 0;
        int sum2 = 0;
        int answer = 0;
        for (int i = 0; i < sArray2.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            sum1 += n1; 
            sum2 += n2;
            if(sum1 == sum2){
                answer = i + 1;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}