// https://www.acmicpc.net/problem/25326
// 다중 항목 선호도 조사 (Small)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        String[][] array = new String[size1][3];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            array[i][0] = sArray[0];
            array[i][1] = sArray[1];
            array[i][2] = sArray[2];
        }
        for (int i = 0; i < size2; i++) {
            int result = 0;
            sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            String str3 = sArray[2];
            for (int j = 0; j < array.length; j++) {
                boolean flag = true;
                if(!str1.equals("-")){
                    if(!str1.equals(array[j][0])){
                        flag = false;
                    }
                }
                if(!str2.equals("-")){
                    if(!str2.equals(array[j][1])){
                        flag = false;
                    }
                }
                if(!str3.equals("-")){
                    if(!str3.equals(array[j][2])){
                        flag = false;
                    }
                }
                if(flag){
                    result++;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

}
