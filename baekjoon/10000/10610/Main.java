// https://www.acmicpc.net/problem/10610
// 30
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "-1";
        int zeroCount = str.length() - str.replaceAll("0", "").length();
        if(zeroCount != 0){
            int sum = 0;
            str = str.replaceAll("0", "");
            int[] array = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                int n = Integer.parseInt(str.charAt(i)+"");
                array[i] = n;
                sum += n;
            }
            if(sum % 3 == 0){
                answer = "";
                Arrays.sort(array);
                for (int i = array.length - 1; i >= 0; i--) {
                    answer += array[i];
                }
                for (int i = 0; i < zeroCount; i++) {
                    answer += "0";
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    

}