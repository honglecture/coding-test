// https://www.acmicpc.net/problem/20112
// 미아 노트
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int b = Integer.parseInt(sArray[2]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("?");
        }
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = "";
            for (int j = 0; j < str.length(); j += b) {
                boolean flag = false;
                for (int k = j; k < j + b; k++) {
                    char c = str.charAt(k);
                    if(c != '?'){
                        flag = true;
                        result += c;
                        break;
                    }
                }
                if(!flag){
                    result += "?";
                }
            }
            for (int j = 0; j < result.length(); j++) {
                char c = result.charAt(j);
                if(c != '?'){
                    sb.setCharAt(j, c);
                }
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}
