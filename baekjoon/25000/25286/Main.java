// https://www.acmicpc.net/problem/25286
// 11월 11일
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result1 = 0;
            int result2 = 0;
            int result3 = 0;
            if(n2 == 1){
                n1 -= 1;
                n2 = 12;
            } else {
                n2 -= 1;
            }
            result1 = n1;
            result2 = n2;
            if(n2 == 2){
                if((n1 % 100 != 0 && n1 % 4 == 0) || (n1 % 400 == 0)){
                    result3 = 29;
                } else {
                    result3 = 28;
                }
            } else {
                result3 = array[n2];
            }
            bw.write(result1 + " " + result2 + " " + result3 + "\n");
        }
        bw.flush();
        bw.close();
    }

}
