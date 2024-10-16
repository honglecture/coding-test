// https://www.acmicpc.net/problem/32278
// 선택 가능성이 가장 높은 자료형
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long key = Long.parseLong(bf.readLine());
        String answer = "";
        if(key >= Short.MIN_VALUE && key <= Short.MAX_VALUE){
            answer = "short";
        } else if(key >= Integer.MIN_VALUE && key <= Integer.MAX_VALUE){
            answer = "int";
        } else {
            answer = "long long";
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
