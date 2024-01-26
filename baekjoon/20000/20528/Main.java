// https://www.acmicpc.net/problem/20528
// 끝말잇기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        boolean flag = true;
        for (int i = 0; i < size - 1; i++) {
            String s1 = sArray[i];
            String s2 = sArray[i + 1];
            if(s1.charAt(s1.length() - 1) != s2.charAt(0)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
