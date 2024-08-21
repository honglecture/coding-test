// https://www.acmicpc.net/problem/25893
// Majestic 10
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String[] sArray = str.split(" ");
            int count = 0;
            for (int j = 0; j < sArray.length; j++) {
                String s = sArray[j];
                if(s.length() > 1){
                    count++;
                }
            }
            bw.write(str + "\n");
            if(count == 1){
                bw.write("double\n");
            } else if(count == 2){
                bw.write("double-double\n");
            } else if(count == 3){
                bw.write("triple-double\n");
            } else {
                bw.write("zilch\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
