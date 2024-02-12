// https://www.acmicpc.net/problem/9437
// 사라진 페이지 찾기
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("0")){
                break;
            }
            String[] sArray = str.split(" ");
            int n = Integer.parseInt(sArray[0]);
            int p = Integer.parseInt(sArray[1]);
            int[] array = new int[4];
            for (int i = 1; i <= n; i += 2) {
                int n1 = i;
                int n2 = i + 1;
                int n3 = n + 1 - i;
                int n4 = n - i;
                if(p == n1 || p == n2 || p == n3 || p == n4){
                    array[0] = n1;
                    array[1] = n2;
                    array[2] = n3;
                    array[3] = n4;
                    break;
                }
                
            }
            Arrays.sort(array);
                String result = "";
                for (int j = 0; j < array.length; j++) {
                    if(array[j] == p){
                        continue;
                    }
                    result += array[j] + " ";
                }
                result = result.substring(0, result.length() - 1);
                bw.write(result + "\n");

        }
        bw.flush();
        bw.close();
    }

    
    
}