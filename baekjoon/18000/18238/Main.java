// https://www.acmicpc.net/problem/18238
// ZOAC 2
import java.io.*;

public class Main {

    private static String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int startIndex = 0;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            if(startIndex == n){
                continue;
            }
            int answer1 = getLeft(startIndex, array[n]);
            int answer2 = getright(startIndex, array[n]);
            if(answer1 > answer2){
                answer += answer2;
            } else {
                answer += answer1;
            }
            startIndex = n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static int getLeft(int startIndex, String s){
        int result = 0;
        boolean flag = false;
        for (int i = startIndex; i >= 0; i--) {
            if(array[i].equals(s)){
                flag = true;
                break;
            }
            result++;
        }
        if(flag){
            return result;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i].equals(s)){
                break;
            }
            result++;
        }
        return result;
    }
    private static int getright(int startIndex, String s){
        int result = 0;
        boolean flag = false;
        for (int i = startIndex; i < array.length; i++) {
            if(array[i].equals(s)){
                flag = true;
                break;
            }
            result++;
        }
        if(flag){
            return result;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(s)){
                break;
            }
            result++;
        }
        return result;
    }

}
