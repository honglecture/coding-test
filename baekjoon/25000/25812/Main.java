// https://www.acmicpc.net/problem/25812
// Nice Raises
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result1 = n + key;
            int result2 = n * 2;
            if(result1 == result2){
                continue;
            }
            if(result1 > result2){
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 > count2){
            System.out.println("1");
        } else if(count1 < count2){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
