// https://www.acmicpc.net/problem/5222
// Vigenère Cipher
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            String result = getAnswer(str1, str2);
            bw.write("Ciphertext: " + result + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static String getAnswer(String str1, String str2){
        String answer = "";
        int[] array = new int[str1.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str1.charAt(i) - 65;
        }
        for (int i = 0; i < str2.length(); i++) {
            int index = str2.charAt(i) + array[i % str1.length()];
            if(index > 90){
                index -= 26;
            }
            answer += String.valueOf((char) index);
        }
        return answer;
    }
}