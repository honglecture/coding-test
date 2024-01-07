// https://www.acmicpc.net/problem/10173
// 니모를 찾아서
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("EOI")){
                break;
            }
            String[] array = str.split(" ");
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if(array[i].toUpperCase().contains("NEMO")){
                    flag = true;
                    break;
                }
            }
            if(flag){
                bw.write("Found\n");
            } else {
                bw.write("Missing\n");
            }
        }
        bw.flush();
        bw.close();
    }
}


