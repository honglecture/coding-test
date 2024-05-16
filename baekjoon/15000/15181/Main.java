// https://www.acmicpc.net/problem/15181
// Beautiful Music
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            boolean flag = true;
            if(str.equals("#")){
                break;
            }
            for (int i = 0; i < str.length() - 1; i++) {
                int n1 = str.charAt(i) - 65;
                int n2 = str.charAt(i + 1) - 65;
                if(n1 > n2){
                    int key = (7 - n1) + n2;
                    if(key != 2 && key != 4 && key != 6){
                        flag = false;
                        break;
                    }
                } else if(n1 < n2){
                    int key = n2 - n1;
                    if(key != 2 && key != 4 && key != 6){
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bw.write("That music is beautiful.\n");
            } else {
                bw.write("Ouch! That hurts my ears.\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}
