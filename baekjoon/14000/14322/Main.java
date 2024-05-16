// https://www.acmicpc.net/problem/14322
// 정육각형과 삼각형
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String answer = "";
            int count = 0;
            Set<String> set = new HashSet<>();
            for (int j = 0; j < size; j++) {
                String str = bf.readLine();
                for (int k = 0; k < str.length(); k++) {
                    if(str.charAt(k) == ' '){
                        continue;
                    }
                    set.add(String.valueOf(str.charAt(k)));
                }
                if(set.size() > count){
                    answer = str;
                    count = set.size();
                } else if(set.size() == count){
                    String[] tempArray = {str, answer};
                    Arrays.sort(tempArray);
                    answer = tempArray[0];
                }
                set.clear();
            }
            bw.write("Case #"+(i + 1)+": " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }


}