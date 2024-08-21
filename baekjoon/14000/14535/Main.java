// https://www.acmicpc.net/problem/14535
// Birthday Graph
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 1;
        String[] array = {
            "", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        while (true) {
            int size = Integer.parseInt(bf.readLine().trim());
            if(size == 0){
                break;
            }
            bw.write("Case #" + (index++) + ":\n");
            int[] countArray = new int[13];
            for (int i = 0; i < size; i++) {
                String temp = bf.readLine();
                String s = "";
                for (int j = 0; j < temp.length(); j++) {
                    if(temp.charAt(j) == ' '){
                        continue;
                    }
                    s += String.valueOf(temp.charAt(j));
                }
                StringBuilder sb = new StringBuilder(s.substring(2, 4));
                countArray[Integer.parseInt(sb.toString().trim())]++;
            }
            for (int i = 1; i < countArray.length; i++) {
                int n = countArray[i];
                String str = "";
                for (int j = 0; j < n; j++) {
                    str += "*";
                }
                bw.write(array[i] + ":" + str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}