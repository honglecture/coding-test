// https://www.acmicpc.net/problem/16499
// 동일한 단어 그룹화하기
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("");
            Arrays.sort(sArray);
            String str = "";
            for (int j = 0; j < sArray.length; j++) {
                str += sArray[j];
            }
            set.add(str);
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

    


}
