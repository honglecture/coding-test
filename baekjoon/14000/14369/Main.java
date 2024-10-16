// https://www.acmicpc.net/problem/14369
// 전화번호 수수께끼 (Small)
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            List<String> list = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                list.add(String.valueOf(str.charAt(j)));
            }
            String answer = getAnswer(list);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getAnswer(List<String> list){
        String result = "";
        String[] strArray = {"ZERO", "ONE", "TWO", "THERE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        while (true) {
            if(list.size() == 0){
                break;
            }
            for (int i = 0; i < strArray.length; i++) {
                String str = strArray[i];
                
            }
        }
        return result;
    }


}