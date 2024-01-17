// https://www.acmicpc.net/problem/8723
// Patyki
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int[] array = {n1, n2, n3};
        Arrays.sort(array);
        int result1 = (array[0] * array[0]) + (array[1] * array[1]);
        int result2 = array[2] * array[2];
        if(result1 == result2){
            System.out.println("1");
        } else {
            if(array[0] == array[1] && array[1] == array[2]){
                System.out.println("2");
            } else {
                System.out.println("0");
            }
        }
        bw.flush();
        bw.close();
    }
   
}