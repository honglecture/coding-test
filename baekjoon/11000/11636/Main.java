// https://www.acmicpc.net/problem/11636
// Stand on Zanzibar
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 1; j < array.length; j++) {
                int n1 = array[j - 1];
                int n2 = array[j];
                if(n1 * 2 >= n2){
                    continue;
                } else {
                    sum += (n2 - (n1 * 2));
                }
            }
            bw.write(sum + "\n");
        }
        
        bw.flush();
        bw.close();
    }

    
}

