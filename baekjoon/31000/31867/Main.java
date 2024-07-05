// https://www.acmicpc.net/problem/31867
// 홀짝홀짝
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int count1 = 0;
        int count2 = 0;
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(n % 2 == 0){
                count2++;
            } else {
                count1++;
            }
        }
        if(count1 > count2){
            System.out.println("1");
        } else if(count1 < count2){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
        bw.flush();
        bw.close();
    }

}
