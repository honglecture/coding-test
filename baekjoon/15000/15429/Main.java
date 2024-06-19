// https://www.acmicpc.net/problem/15429
// Odd Gnome
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int[] array = new int[sArray.length - 1];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j + 1]);
            }
            int answer = 0;
            for (int j = 1; j < array.length; j++) {
                if(array[j - 1] + 1 != array[j]){
                    answer = j + 1;
                    break;
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    
}
