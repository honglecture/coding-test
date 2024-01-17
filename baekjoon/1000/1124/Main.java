// https://www.acmicpc.net/problem/1124
// 언더프라임
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        int count = 0;
        for (int i = start; i <= end; i++) {
            int n = getCount(i);
            if(getAnswer(n)){
                count++;
            }
        }

        // 2 ~ 100000 까지의 수  소수
        System.out.println(count);
        bw.flush();
        bw.close();
    }


    private static boolean getAnswer(int n){
        if(n == 1){
            return false;
        } else if(n == 2){
            return true;
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    private static int getCount(int n){
        int count = 0;
        int start = 2;
        while (true) {
            if(n == 1){
                break;
            }
            if(n % start == 0){
                count++;
                n /= start;
            } else {
                start++;
            }
        }
        return count;
    }
    

}


