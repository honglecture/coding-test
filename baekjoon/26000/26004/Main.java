// https://www.acmicpc.net/problem/26004
// HI-ARC
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] array = new int[5];
        //  𝐇 𝐈 𝐀 𝐑 𝐂
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'H'){
                array[0]++;
            } else if(c == 'I'){
                array[1]++;
            } else if(c == 'A'){
                array[2]++;
            } else if(c == 'R'){
                array[3]++;
            } else if(c == 'C'){
                array[4]++;
            }
        }
        Arrays.sort(array);
        System.out.println(array[0]);
        bw.flush();
        bw.close();
    }

}
