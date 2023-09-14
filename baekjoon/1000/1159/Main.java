// https://www.acmicpc.net/problem/1159
// 농구 경기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] charArray = new int[26];
        String[] array = new String[size];
        String answer = "";
        for (int i = 0; i < size; i++) {
            array[i] = bf.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            int c = array[i].charAt(0) - 97;
            charArray[c]++;
        }
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 5){
                answer += String.valueOf((char) (i + 97));
            }
        }
        if(answer.equals("")){
            answer = "PREDAJA";
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}