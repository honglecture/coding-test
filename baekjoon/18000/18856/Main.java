// https://www.acmicpc.net/problem/18856
// 피드백
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int lastNum = array[size - 1];
        for (int i = lastNum; i <= 1000; i++) {
            if(isPrime(i)){
                lastNum = i;
                break;
            }
        }
        array[size - 1] = lastNum;
        bw.write(size + "\n");
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int n){
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
