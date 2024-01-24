// https://www.acmicpc.net/problem/2985
// 세 수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        String answer = getAnswer(n1, n2, n3);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    private static String getAnswer(int n1, int n2, int n3){
        String result = "";
        if(n1 + n2 == n3){
            result = n1 + "+" + n2 + "=" + n3;
            return result;
        }
        if(n1 - n2 == n3){
            result = n1 + "-" + n2 + "=" + n3;
            return result;
        }
        if(n1 * n2 == n3){
            result = n1 + "*" + n2 + "=" + n3;
            return result;
        }
        if(n1 / n2 == n3){
            result = n1 + "/" + n2 + "=" + n3;
            return result;
        }
        if(n2 + n3 == n1){
            result = n1 + "=" + n2 + "+" + n3;
            return result;
        }
        if(n2 - n3 == n1){
            result = n1 + "=" + n2 + "-" + n3;
            return result;
        }
        if(n2 * n3 == n1){
            result = n1 + "=" + n2 + "*" + n3;
            return result;
        }
        if(n2 / n3 == n1){
            result = n1 + "=" + n2 + "/" + n3;
            return result;
        }
        return result;
    }
}