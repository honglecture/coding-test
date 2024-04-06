// https://www.acmicpc.net/problem/7366
// Counting Sheep
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int count = 0;
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].equals("sheep")){
                    count++;
                }
            }
            bw.write("Case "+(i + 1)+": This list contains "+count+" sheep.\n");
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}