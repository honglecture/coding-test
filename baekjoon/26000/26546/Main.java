// https://www.acmicpc.net/problem/26546
// Reverse
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            int n1 = Integer.parseInt(sArray[1]);
            int n2 = Integer.parseInt(sArray[2]);
            String result = "";
            for (int j = 0; j < s1.length(); j++) {
                if(j >= n1 && j < n2){
                    continue;
                }
                result += s1.charAt(j);
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

}
