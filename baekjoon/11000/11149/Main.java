// https://www.acmicpc.net/problem/11149
// Decode the Message
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String answer = "";
            for (int j = 0; j < sArray.length; j++) {
                String str = sArray[j];
                int sum = 0;
                for (int k = 0; k < str.length(); k++) {
                    sum += str.charAt(k) - 97;
                }
                sum = sum % 27;
                if(sum == 26){
                    answer += " ";
                } else {
                    answer += String.valueOf((char)(sum + 97));
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}