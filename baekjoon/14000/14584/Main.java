// https://www.acmicpc.net/problem/14584
// 암호 해독
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        String str = bf.readLine();
        char[] strArray = new char[str.length()];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = str.charAt(i);
        }
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        for (int i = 0; i <= 27; i++) {
            boolean flag = false;
            for (int j = 0; j < strArray.length; j++) {
                answer += String.valueOf(strArray[j]);
            }
            for (int j = 0; j < array.length; j++) {
                if(answer.contains(array[j])){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            for (int j = 0; j < strArray.length; j++) {
                int n = strArray[j] + 1;
                if(n > 122){
                    n = 97;
                }
                strArray[j] = (char) n;
            }
            answer = "";
        }
        
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}