// https://www.acmicpc.net/problem/10825
// 국영수
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Object[][] array = new Object[size][4];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = sArray[0];
            array[i][1] = Integer.parseInt(sArray[1]);
            array[i][2] = Integer.parseInt(sArray[2]);
            array[i][3] = Integer.parseInt(sArray[3]);
        }
        Arrays.sort(array, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if((int) o1[1] == (int) o2[1]){
                    if((int) o1[2] == (int) o2[2]){
                        if((int) o1[3] == (int) o2[3]){
                            String s1 = (String) o1[0];
                            String s2 = (String) o2[0];
                            return s1.compareTo(s2);
                        } else {
                            return (int)o2[3] - (int)o1[3];
                        }
                    } else {
                        return (int)o1[2] - (int)o2[2];
                    }
                } else {
                    return (int)o2[1] - (int)o1[1];
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i][0] + "\n");
        }
        bw.flush();
        bw.close();
    }


}