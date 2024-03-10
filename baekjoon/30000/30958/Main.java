// https://www.acmicpc.net/problem/30958
// 서울사이버대학을 다니고
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 97 && c <= 122){
                int index = c - 97;
                array[index]++;
            }
        }
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
        bw.flush();
        bw.close();
    }

    

}
