// https://www.acmicpc.net/problem/15786
// Send me the money
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        String key = bf.readLine();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int index = 0;
            for (int j = 0; j < str.length(); j++) {
                char c1 = str.charAt(j);
                char c2 = key.charAt(index);
                if(c1 == c2){
                    index++;
                }
                if(index >= n){
                    break;
                }
            }
            if(index >= n){
                bw.write("true\n");
            } else {
                bw.write("false\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}