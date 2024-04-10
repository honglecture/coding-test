// https://www.acmicpc.net/problem/9947
// Coin tossing
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String name1 = sArray[0];
            String name2 = sArray[1];
            if(name1.equals("#") && name2.equals("#")){
                break;
            }
            int size = Integer.parseInt(bf.readLine());
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < size; i++) {
                sArray = bf.readLine().split(" ");
                String s1 = sArray[0];
                String s2 = sArray[1];
                if(s1.equals(s2)){
                    count1++;
                } else {
                    count2++;
                }
            }
            bw.write(name1 + " " + count1 + " " + name2 + " " + count2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}