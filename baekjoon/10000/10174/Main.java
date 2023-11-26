// https://www.acmicpc.net/problem/10174
// 팰린드롬
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine().toUpperCase();
            if(getAnswer(str)){
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }
        bw.flush();
        bw.close();
    }
    private static boolean getAnswer(String str){
        boolean flag = true;
        int size = str.length() / 2;
        for (int i = 0; i < size; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if(c1 != c2){
                flag = false;
                break;
            }
        }
        return flag;
    }
}


