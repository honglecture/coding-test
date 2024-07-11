// https://www.acmicpc.net/problem/22403
// 阿吽の呼吸
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.equals("A")){
                count++;
            } else {
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count != 0){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        bw.flush();
        bw.close();
    }

}
