// https://www.acmicpc.net/problem/24073
// ビ太郎と IOI (Bitaro and IOI)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(count == 1){
                if(c == 'I'){
                    count++;
                }
            } else if(count == 2){
                if(c == 'O'){
                    count++;
                }
            } else if(count == 3){
                if(c == 'I'){
                    count++;
                    break;
                }
            }
        }
        if(count == 4){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

}
