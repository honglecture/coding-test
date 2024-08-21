// https://www.acmicpc.net/problem/16755
// Magnus
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        // HONI
        int start = 0;
        int answer = 0;
        String[] array = {"H", "O", "N", "I"};
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals(array[start])){
                start++;
                if(start == array.length){
                    start = 0;
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
