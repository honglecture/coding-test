// https://www.acmicpc.net/problem/14910
// 오르막
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i];
            int n2 = array[i + 1];
            if(n1 > n2){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
        bw.flush();
        bw.close();
    }
    
    
}