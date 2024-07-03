// https://www.acmicpc.net/problem/20355
// Caesar Word Salad
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str =  bf.readLine();
        int[] array = new int[str.length()];
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i) - 97;
        }
        for (int i = 0; i <= 25; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(array[j] == 105 - 97){
                    flag = false;
                }
            }
            if(flag){
                answer++;
            }
            for (int j = 0; j < array.length; j++) {
                array[j]++;
                if(array[j] > 25){
                    array[j] = 0;
                }
            }
        }
        if(answer == 0){
            System.out.println("impossible");
        } else {
            System.out.println(answer);
        }
        
        bw.flush();
        bw.close();
    }

}
