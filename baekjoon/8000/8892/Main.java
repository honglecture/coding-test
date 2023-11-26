// https://www.acmicpc.net/problem/8892
// 팰린드롬
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            String[] array = new String[size];
            String answer = "0";
            for (int j = 0; j < size; j++) {
                String str = bf.readLine();
                array[j] = str;
            }
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    String str1 = array[j] + array[k];
                    String str2 = array[k] + array[j];
                    if(checkAnswer(str1)){
                        answer = str1;
                        break;
                    }
                    if(checkAnswer(str2)){
                        answer = str2;
                        break;
                    }
                }
                if(!answer.equals("0")){
                    break;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static boolean checkAnswer(String str){
        boolean flag = true;
        int size = str.length() / 2;
        for (int i = 0; i < size; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if(c1 != c2){
                flag = false;
                break;
            }
        }
        return flag;
    }
   
}