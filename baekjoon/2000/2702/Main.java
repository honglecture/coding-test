// https://www.acmicpc.net/problem/2702
// N번째 큰 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int a = Integer.parseInt(sArray[0]);
            int b = Integer.parseInt(sArray[1]);
            int result1 = getAnswer1(Integer.min(a, b), Integer.max(a, b));
            int result2 = getAnswer2(Integer.min(a, b), Integer.max(a, b));
            bw.write(result1 + " " + result2 + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static int getAnswer1(int a, int b){
        int result = 0;
        int count = 1;
        while (true) {
            int num = a * count;
            if(num % b == 0){
                result = num;
                break;
            }
            count++;
        }
        return result;
    }

    private static int getAnswer2(int a, int b){
        int result = 0;
        for (int i = a; i >= 1; i--) {
            if(b % i == 0 && a % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }


}