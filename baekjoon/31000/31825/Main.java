// https://www.acmicpc.net/problem/31825
// 알파벳과 쿼리 (Easy)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[1]);
        String[] array = new String[Integer.parseInt(sArray[0])];
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            array[i] = String.valueOf(str.charAt(i));
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int type = Integer.parseInt(sArray[0]);
            int start = Integer.parseInt(sArray[1]) - 1;
            int end = Integer.parseInt(sArray[2]) - 1;
            if(type == 1){
                String currentString = array[start];
                int count = 1;
                for (int j = start + 1; j <= end; j++) {
                    String s = array[j];
                    if(!s.equals(currentString)){
                        count++;
                        currentString = s;
                    }
                }
                bw.write(count + "\n");
            } else {
                for (int j = start; j <= end; j++) {
                    int index = array[j].charAt(0) + 1;
                    if(index > 90){
                        index = 65;
                    }
                    array[j] = String.valueOf((char) index);
                }
            }
        }
        bw.flush();
        bw.close();
    }

    

}
