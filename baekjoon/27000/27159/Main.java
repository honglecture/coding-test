// https://www.acmicpc.net/problem/27159
// 노 땡스!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = 0;
        int n = array[0];
        
        for (int i = 1; i < array.length; i++) {
            int n1 = array[i];
            int n2 = array[i - 1];
            if(n1 - n2 == 1){
                continue;
            } else {
                answer += n;
                n = n1;
            }
        }
        answer += n;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
