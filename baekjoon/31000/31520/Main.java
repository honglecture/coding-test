// https://www.acmicpc.net/problem/31520
// Champernowne Verification
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        int start = 1;
        while (true) {
            if(sb.length() == 0){
                start -= 1;
                break;
            }
            String str = String.valueOf(start);
            int length = str.length();
            if(sb.length() < length){
                start = -1;
                break;
            }
            String sub = sb.substring(0, length);
            if(!str.equals(sub)){
                start = -1;
                break;
            }
            sb.delete(0, length);
            start++;
        }
        System.out.println(start);
        bw.flush();
        bw.close();
    }

    

}
