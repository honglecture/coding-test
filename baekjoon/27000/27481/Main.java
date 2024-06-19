// https://www.acmicpc.net/problem/27481
// Hotelier
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int[] array = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'L'){
                for (int j = 0; j < array.length; j++) {
                    if(array[j] == 0){
                        array[j] = 1;
                        break;
                    }
                }
            } else if(c == 'R'){
                for (int j = array.length - 1; j >= 0; j--) {
                    if(array[j] == 0){
                        array[j] = 1;
                        break;
                    }
                }
            } else {
                int n = Integer.parseInt(String.valueOf(c));
                array[n] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + "");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    

}
