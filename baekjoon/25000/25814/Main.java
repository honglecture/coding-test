// https://www.acmicpc.net/problem/25814
// Heavy Numbers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str1 = sArray[0];
        String str2 = sArray[1];
        int result1 = getAnswer(str1);
        int result2 = getAnswer(str2);
        if(result1 > result2){
            System.out.println("1");
        } else if(result1 < result2){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String str){
        int sum = 0;
        int size = str.length();
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int result = sum * size;
        return result;
    }
    
}
