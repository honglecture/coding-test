// https://www.acmicpc.net/problem/14007
// Small Weird Measurements
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int beforeNum = array[i];
            boolean flag = false;
            answer++;
            for (int j = i + 1; j < array.length; j++) {
                int n = array[j];
                if(n == beforeNum){
                    break;
                }
                if(j == i + 1){
                    if(beforeNum > n){
                        flag = false;
                    } else {
                        flag = true;
                    }
                } else {
                    if(flag){
                        if(beforeNum > n){
                            break;
                        }
                    } else {
                        if(beforeNum < n){
                            break;
                        }
                    }
                }
                flag = !flag;
                answer++;
                beforeNum = n;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}