// https://school.programmers.co.kr/learn/courses/30/lessons/340213
// [PCCP 기출문제] 1번 / 동영상 재생기

class Solution {

    public static void main(String[] args) {
        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands = {"next", "prev"};
        String result = solution(video_len, pos, op_start, op_end, commands);
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int currentTime = getNumber(pos);
        int videoTime = getNumber(video_len);
        int opStartTime = getNumber(op_start);
        int opEndTime = getNumber(op_end);
        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];
            if(currentTime >= opStartTime && currentTime <= opEndTime){
                currentTime = opEndTime;
            }
            if(command.equals("next")){
                if(currentTime + 10 >= videoTime){
                    currentTime = videoTime;
                } else {
                    currentTime += 10;
                }
            } else {
                if(currentTime - 10 <= 0){
                    currentTime = 0;
                } else {
                    currentTime -= 10;
                }
            }
        }
        int result1 = currentTime / 60;
        int result2 = currentTime % 60;
        String result3 = result1 < 10 ? "0" + result1 : result1 + "";
        String result4 = result2 < 10 ? "0" + result2 : result2 + "";
        answer = result3 + ":" + result4;
        return answer;
    }

    private static int getNumber(String str){
        int result = 0;
        String[] sArray = str.split("\\:");
        result += Integer.parseInt(sArray[0]) * 60;
        result += Integer.parseInt(sArray[1]);
        return result;
    }
}