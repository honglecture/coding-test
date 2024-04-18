// https://www.acmicpc.net/problem/17011
// Cold Compress
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            StringBuilder sb = new StringBuilder();
            String key = "";
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(key.equals("")){
                    key = s;
                    count++;
                } else {
                    if(key.equals(s)){
                        count++;
                    } else {
                        sb.append(count + " " + key + " ");
                        count = 1;
                        key = s;
                    }
                }
            }
            sb.append(count + " " + key);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
