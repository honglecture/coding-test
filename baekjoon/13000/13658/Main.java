// https://www.acmicpc.net/problem/13658
// 계약 검토
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            if(str1.equals("0") && str2.equals("0")){
                break;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str2.length(); i++) {
                if(str1.charAt(0) == str2.charAt(i)){
                    continue;
                }
                sb.append(String.valueOf(str2.charAt(i)));
            }
            while (true) {
                if(sb.length() == 0){
                    break;
                }
                if(sb.charAt(0) != '0'){
                    break;
                }
                sb.deleteCharAt(0);
            }
            if(sb.length() == 0){
                bw.write("0\n");
            } else {
                bw.write(sb.toString() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}