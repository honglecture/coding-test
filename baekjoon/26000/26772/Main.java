// https://www.acmicpc.net/problem/26772
// Poziome serca
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str1 = " @@@   @@@ ";
        String str2 = "@   @ @   @";
        String str3 = "@    @    @";
        String str4 = "@         @";
        String str5 = " @       @ ";
        String str6 = "  @     @  ";
        String str7 = "   @   @   ";
        String str8 = "    @ @    ";
        String str9 = "     @     ";
        String[] array = {str1, str2, str3, str4, str5, str6, str7, str8, str9};
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < size; j++) {
                if(j == size - 1){
                    sb.append(array[i]);
                } else {
                    sb.append(array[i] + " ");
                }
            }
            System.out.println(sb.toString());
        }
        bw.flush();
        bw.close();
    }

}
