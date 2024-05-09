// https://www.acmicpc.net/problem/31663
// Mean Words
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        String answer = "";
        for (int i = 0; i < size; i++) {
            array[i] = bf.readLine();
        }
        int maxSize = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxSize < array[i].length()){
                maxSize = array[i].length();
            }
        }
        for (int i = 0; i < maxSize; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[j].length() - 1 < i){
                    continue;
                }
                count++;
                sum += array[j].charAt(i) - 97;
            }
            int result = Math.round(sum / count);
            answer += String.valueOf((char) (result + 97));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
