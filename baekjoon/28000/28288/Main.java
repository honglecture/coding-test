// https://www.acmicpc.net/problem/28288
// Special Event
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][5];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        List<Integer> list = new ArrayList<>();
        int maxCount = 0;
        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[j][i].equals("Y")){
                    count++;
                }
            }
            if(maxCount < count){
                maxCount = count;
                list.clear();
                list.add(i + 1);
            } else if(maxCount == count){
                list.add(i + 1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                bw.write(list.get(i)+"");
            } else {
                bw.write(list.get(i) + ",");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

  
}
