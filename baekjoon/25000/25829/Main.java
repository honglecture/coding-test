// https://www.acmicpc.net/problem/25829
// Presidential Election
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int count1 = 0;
        int count2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            sum1 += n2;
            sum2 += n3;
            if(n2 > n3){
                count1 += n1;
            } else {
                count2 += n1;
            }
        }
        if(count1 > count2 && sum1 >  sum2){
            System.out.println("1");
        } else if(count1 < count2 && sum1 < sum2){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
