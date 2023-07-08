// https://www.acmicpc.net/problem/1924
// 2007년
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Calendar cal = Calendar.getInstance();
        cal.set(2007, n1-1, n2);
        Date date = new Date(cal.getTimeInMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String result = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US).toUpperCase();
        bw.write(result+"\n");        
        bw.flush();
        bw.close();
    }
}