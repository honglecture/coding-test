// https://www.acmicpc.net/problem/27182
// Rain Diary
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]); // 현재 날짜
        int n2 = Integer.parseInt(sArray[1]); // 지지난주 날짜
        int n3 = n1 - 7;
        if(n3 < 1){
            int result1 = n2 + 14;
        } else {
            System.out.println(n3);
        }
        bw.flush();
        bw.close();
    }

    

}
