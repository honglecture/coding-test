// https://www.acmicpc.net/problem/13224
// Chop Cup
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = new int[3];
        array[0] = 1;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index1 = 0;
            int index2 = 0;
            if(c == 'A'){
                index1 = 0;
                index2 = 1;
            } else if(c == 'B'){
                index1 = 1;
                index2 = 2;
            } else {
                index1 = 0;
                index2 = 2;
            }
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                answer = i + 1;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}