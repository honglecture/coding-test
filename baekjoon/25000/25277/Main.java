// https://www.acmicpc.net/problem/25277
// Culture shock
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            if(str.equals("he") || str.equals("him")|| str.equals("she")|| str.equals("her")){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
