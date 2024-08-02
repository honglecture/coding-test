// https://www.acmicpc.net/problem/12603
// Store Credit (Small)
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int sum = Integer.parseInt(bf.readLine());
            int[] array = new int[Integer.parseInt(bf.readLine())];
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            String answer = "";
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length ; k++) {
                    if(array[j] + array[k] == sum){
                        answer = "Case #"+(i + 1)+": " + (j + 1) + " " + (k + 1);
                    }
                }
                if(!answer.equals("")){
                    break;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


