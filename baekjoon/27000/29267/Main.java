// https://www.acmicpc.net/problem/29267
// Случай с игрой
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int count = 0;
        int saveCount = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.equals("save")){
                saveCount = count;
            } else if(str.equals("load")){
                count = saveCount;
            } else if(str.equals("shoot")){
                count--;
            } else if(str.equals("ammo")){
                count += key;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
