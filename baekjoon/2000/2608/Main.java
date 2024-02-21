// https://www.acmicpc.net/problem/2608
// 로마 숫자
import java.io.*;
public class Main {

    private static String[] array1 = {"I", "V", "X", "L", "C", "D", "M"};
    private static int[] array2 = {1, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int sum1 = getAnswer(str1);
        int sum2 = getAnswer(str2);
        System.out.println(sum1);
        System.out.println(sum2);
        int answer1 = sum1 + sum2;
        System.out.println(answer1);
        bw.flush();
        bw.close();
    }
    
    private static int getAnswer(String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            for (int j = 0; j < array1.length; j++) {
                if(array1[j].equals(s)){
                    result += array2[j];
                    break;
                }
            }
        }
        return result;
    }
}