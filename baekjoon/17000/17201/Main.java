// https://www.acmicpc.net/problem/17201
// 자석 체인
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String start = String.valueOf(str.charAt(0));
        boolean flag = true;
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(start.equals("1")){
                if(!s.equals("2")){
                    flag = false;
                    break;
                } else {
                    start = "2";
                }
            } else {
                if(!s.equals("1")){
                    flag = false;
                    break;
                } else {
                    start = "1";
                }
            }
        }
        if(flag){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

}
