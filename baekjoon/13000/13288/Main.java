// https://www.acmicpc.net/problem/13288
// A New Alphabet
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine().toLowerCase();
        String[] array = new String[26];
        StringBuilder sb = new StringBuilder();
        array[0] = "@";
        array[1] = "8";
        array[2] = "(";
        array[3] = "|)";
        array[4] = "3";
        array[5] = "#";
        array[6] = "6";
        array[7] = "[-]";
        array[8] = "|";
        array[9] = "_|";
        array[10] = "|<";
        array[11] = "1";
        array[12] = "[]\\/[]";
        array[13] = "[]\\[]";
        array[14] = "0";
        array[15] = "|D";
        array[16] = "(,)";
        array[17] = "|Z";
        array[18] = "$";
        array[19] = "']['";
        array[20] = "|_|";
        array[21] = "\\/";
        array[22] = "\\/\\/";
        array[23] = "}{";
        array[24] = "`/";
        array[25] = "2";
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            if(n >= 97 && n <= 122){
                n -= 97;
                sb.append(array[n]);
            } else {
                sb.append(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }
}

// \/\/[-]@'][''$ ']['[-]3 #|Z3(,)|_|3[]\[](`/, |<3[]\[][]\[]3']['[-]?
// \/\/[-]@'][''$ ']['[-]3 #|Z3(,)|_|3[]\[]('/, |<3[]\[][]\[]3']['[-]?