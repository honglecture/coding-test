// https://www.acmicpc.net/problem/9492
// Perfect Shuffle
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            String[] array = new String[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = bf.readLine();
            }
            if(size % 2 == 0){
                for (int i = 0; i < array.length / 2; i++) {
                    list1.add(array[i]);
                }
                for (int i = array.length / 2; i < array.length; i++) {
                    list2.add(array[i]);
                }
                for (int i = 0; i < list1.size(); i++) {
                    bw.write(list1.get(i) + "\n");
                    bw.write(list2.get(i) + "\n");
                }
            } else {
                String str = array[array.length / 2];
                for (int i = 0; i < array.length / 2; i++) {
                    list1.add(array[i]);
                }
                for (int i = array.length / 2 + 1; i < array.length; i++) {
                    list2.add(array[i]);
                }
                for (int i = 0; i < list1.size(); i++) {
                    bw.write(list1.get(i) + "\n");
                    bw.write(list2.get(i) + "\n");
                }
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
   

}