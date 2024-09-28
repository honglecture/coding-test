// https://www.acmicpc.net/problem/27961
// 고양이는 많을수록 좋다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long key = Long.parseLong(bf.readLine());
        long currentNum = 0;
        int count = 0;
        while (true) {
            if(key == currentNum){
                break;
            }
            if(currentNum == 0){
                currentNum++;
                count++;
                continue;
            }
            long n = currentNum * 2;
            if(key <= n){
                currentNum = key;
            } else {
                currentNum = n;
            }
            count++;
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
