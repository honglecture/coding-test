// https://www.acmicpc.net/problem/2609
// 최대공약수와 최소공배수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result1 = answer1(n1, n2);
        int result2 = answer2(n1, n2);
        bw.write(result1+"\n");
        bw.write(result2+"\n");
        bw.flush();
        bw.close();
    }


    private static int answer1(int n1, int n2){
        int result = 0;
        int max = Integer.max(n1, n2);
        int min = Integer.min(n1, n2);
        for(int i = min; i >= 1; i--){
            if(max % i == 0 && min % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }
    private static int answer2(int n1, int n2){
        int result = 0;
        int max = Integer.max(n1, n2);
        int min = Integer.min(n1, n2);
        int count = 1;
        while(true){
            int n = max * count;
            if(n % max == 0 && n % min == 0){
                result = n;
                break;
            }
            count++;
        }
        return result;
    }

}