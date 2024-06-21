// https://www.acmicpc.net/problem/25024
// 시간과 날짜
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            String result = getAnswer(n1, n2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(int n1, int n2){
        int[] array = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String result = "";
        String result1 = "No";
        String result2 = "No";
        if(n1 >= 0 && n1 <= 23){
            if(n2 >= 0 && n2 <= 59){
                result1 = "Yes";
            }
        }
        if(n1 >= 1 && n1 <= 12){
            if(n2 >= 1 && n2 <= array[n1]){
                result2 = "Yes";
            }
        }
        result = result1 + " " + result2;
        return result;
    }

}
