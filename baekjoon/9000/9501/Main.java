// https://www.acmicpc.net/problem/9501
// 꿍의 우주여행
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int n = Integer.parseInt(sArray[1]);
            int count = 0;
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                double n1 = Integer.parseInt(sArray[0]);
                double n2 = Integer.parseInt(sArray[1]);
                double n3 = Integer.parseInt(sArray[2]);
                double result = (n2 / n3) * n1;
                if(n <= result){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
   

}