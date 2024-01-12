// https://www.acmicpc.net/problem/11576
// Base Conversion
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        long result = 0;
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result += Math.pow(n1, count++) * array[i];
        }
        String answer = "";
        while (true) {
            long n = result % n2;
            answer = n + " " + answer;  
            n = result / n2;
            if(n == 0){
                break;
            } 
            result = n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}

