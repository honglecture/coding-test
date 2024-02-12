// https://www.acmicpc.net/problem/11507
// 카드셋트
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = {13, 13, 13, 13};
        String str = bf.readLine();
        Set<String> set = new HashSet<>();
        boolean flag = false;
        for (int i = 3; i < str.length() + 3; i += 3) {
            int n1 = i - 3;
            int n2 = i;
            String result = str.substring(n1, n2);
            if(set.contains(result)){
                flag = true;
                break;
            }
            set.add(result);
            String s = String.valueOf(result.charAt(0));
            if(s.equals("P")){
                array[0]--;
            } else if(s.equals("K")){
                array[1]--;
            } else if(s.equals("H")){
                array[2]--;
            } else if(s.equals("T")){
                array[3]--;
            }
        }
        if(flag){
            bw.write("GRESKA\n");
        } else {
            bw.write(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
        }
        bw.flush();
        bw.close();
    }


    
}