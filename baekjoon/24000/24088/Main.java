// https://www.acmicpc.net/problem/24088
// 運動会 (Sports Day)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int k = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'R'){
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 == k){
            System.out.println("W");
        } else {
            System.out.println("R");
        }
        bw.flush();
        bw.close();
    }

}
