// https://www.acmicpc.net/problem/4583
// 거울상
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c != 'b' && c != 'd' && c != 'p'&& c != 'q'&& c != 'i'&& c != 'o'&& c != 'v'&& c != 'w'&& c != 'x'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                String answer = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    char c = str.charAt(i);
                    if(c == 'b'){
                        answer += 'd';
                    } else if(c == 'd'){
                        answer += 'b';
                    } else if(c == 'p'){
                        answer += 'q';
                    } else if(c == 'q'){
                        answer += 'p';
                    } else {
                        answer += c;
                    }
                }
                bw.write(answer +"\n");
            } else {
                bw.write("INVALID\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}