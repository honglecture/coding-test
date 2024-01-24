// https://www.acmicpc.net/problem/16199
// 나이 계산하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        sArray = bf.readLine().split(" ");
        int n4 = Integer.parseInt(sArray[0]);
        int n5 = Integer.parseInt(sArray[1]);
        int n6 = Integer.parseInt(sArray[2]);
        int result1 = 0;
        if(n2 > n5){
            result1 = n4 - n1 - 1;
        } else if(n2 < n5){
            result1 = n4 - n1;
            if(result1 == -1){
                result1 = 0;
            }
        } else {
            if(n3 > n6){
                result1 = n4 - n1 - 1;
            } else if(n3 < n6){
                result1 = n4 - n1;
                if(result1 == -1){
                    result1 = 0;
                }
            } else {
                result1 = n4 - n1;
            }
        }
        int result2 = n4 - n1 + 1;
        int result3 = n4 - n1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        bw.flush();
        bw.close();
    }
}

