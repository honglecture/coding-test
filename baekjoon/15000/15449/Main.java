// https://www.acmicpc.net/problem/15449
// Art
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int n1 = array[i];
                    int n2 = array[j];
                    int n3 = array[k];
                    if(n1 + n2 <= n3){
                        continue;
                    }
                    if(n1 + n3 <= n2){
                        continue;
                    }
                    if(n2 + n3 <= n1){
                        continue;
                    }
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
