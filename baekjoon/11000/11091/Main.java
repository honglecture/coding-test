// https://www.acmicpc.net/problem/11091
// 알파벳 전부 쓰기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine().toLowerCase();
            int[] array = new int[26];
            for (int j = 0; j < str.length(); j++) {
                int c = str.charAt(j);
                if(c >= 97 && c <= 122){
                    c -= 97;
                    array[c]++;
                }
            }
            String answer = "";
            for (int j = 0; j < array.length; j++) {
                if(array[j] == 0){
                    answer += (char) (j + 97);
                }
            }
            if(answer.equals("")){
                bw.write("pangram\n");
            } else {
                bw.write("missing "+answer+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
   
}