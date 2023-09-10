// https://www.acmicpc.net/problem/10820
// 문자열 분석
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "";
        while(true){
            int[] array = new int[4];
            str = bf.readLine();
            if(str == null){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                // 소 대 숫 공
                String s = str.charAt(i) + "";
                if(s.equals(" ")){
                    array[3]++;
                } else {
                    int n = str.charAt(i);
                    if(n >= 97 && n <=122){
                        array[0]++;
                    } else if(n >= 65 && n <=90){
                        array[1]++;
                    } else {
                        array[2]++;
                    }
                }
                
            }
            String result = "";
            for (int i = 0; i < array.length; i++) {
                result += array[i] + " ";
            }
            result = result.substring(0, result.length() - 1);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}