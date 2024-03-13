// https://www.acmicpc.net/problem/1213
// 팰린드롬 만들기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = new int[26];
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            array[n]++;
        }
        while (true) {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                int n = array[i];
                if(n > 1){
                    answer += (char) (i + 65);
                    array[i] -= 2;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        if(str.length() % 2 == 0){
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer = answer + new StringBuilder(answer).reverse();
            } else {
                answer = "I'm Sorry Hansoo";
            }
        } else {
            String key = "";
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 1){
                    if(!key.equals("")){
                        flag = false;
                        break;
                    }
                    key = String.valueOf((char)(i + 65));
                }
            }
            if(flag){
                answer = answer + key + new StringBuilder(answer).reverse(); 
            } else {
                answer = "I'm Sorry Hansoo";
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
