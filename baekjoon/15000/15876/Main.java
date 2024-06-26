// https://www.acmicpc.net/problem/15876
// Binary Counting
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int count = 0;
        while (true) {
            if(sb.length() >= n1 * 5){
                break;
            }
            sb.append(Integer.toString(count, 2));
            count++;
        }
        count = 0;
        for (int i = n2 - 1; i < sb.length(); i += n1) {
            bw.write(sb.charAt(i) + " ");
            count++;
            if(count == 5){
                break;
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
    
}