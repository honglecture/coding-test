// https://www.acmicpc.net/problem/25813
// Changing Strings
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int index1 = -1;
        int index2 = -1;
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'U'){
                index1 = i;
                break;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == 'F'){
                index2 = i;
                break;
            }
        }
        for (int i = 0; i < index1; i++) {
            answer += "-";
        }
        answer += "U";
        for (int i = index1 + 1; i < index2; i++) {
            answer += "C";
        }
        answer += "F";
        for (int i = index2 + 1; i < str.length(); i++) {
            answer += "-";
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
