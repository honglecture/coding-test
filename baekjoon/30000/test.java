public class test {

    public static void main(String[] args) {
        int h = 100;
        int w = 100;
        int x = 50;
        int y = 50;
        int r = 2;
        int dx = 5;
        int dy = 5;
        while (true) {
            // 1초 슬립
            x = x + dy; // 현재 위치
            y = y + dy; // 현재 위치
            if(x + r >= w || x - r <= 0 || y + r >= h || y - r <= 0){
                if(dx == 0){
                    dy = -dy;
                } else if(dy == 0){
                    dx = -dx;
                } else {
                    if(dx > 0 && dy > 0){
                        if(x + r >= w){
                            dx = -dx;
                        } else {
                            dy = -dy;
                        }
                    } else if(dx > 0 && dy < 0){
                        if(x + r >= w){
                            dx = -dx;
                        } else {
                            dy = -dy;
                        }
                    } else if(dx < 0 && dy > 0){
                        if(x + r <= 0){
                            dx = -dx;
                        } else {
                            dy = -dy;
                        }
                    } else {
                        if(x + r <= 0){
                            dx = -dx;
                        } else {
                            dy = -dy;
                        }
                    }
                }
            }
        }
    }
    
}
