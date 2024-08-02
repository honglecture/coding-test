// https://www.acmicpc.net/problem/9226
// 도깨비말
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringBuilder str = new StringBuilder(bf.readLine());
            if(str.toString().equals("#")){
                break;
            }
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    flag = true;
                    break;
                }
            }
            if(flag){
                while (true) {
                    char c = str.charAt(0);
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                        break;
                    }
                    str.deleteCharAt(0);
                    str.append(String.valueOf(c));
                }
            }
            
            str.append("ay");
            bw.write(str.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
