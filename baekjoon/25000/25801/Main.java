// https://www.acmicpc.net/problem/25801
// Odd/Even Strings
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            array[index]++;
        }
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                continue;
            }
            if(array[i] % 2 == 0){
                flag2 = true;
            } else {
                flag1 = true;
            }
        }
        if(flag1 && flag2){
            System.out.println("0/1");
        } else if(flag1){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
