import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int fullSec = timeToSec(video_len);
        int posSec = timeToSec(pos);
        int opStartSec = timeToSec(op_start);
        int opEndSec = timeToSec(op_end);

        if (opStartSec <= posSec && posSec <= opEndSec) {
            posSec = opEndSec;
        }

        for (String command : commands) {
            if (command.equals("next")) {
                posSec += 10;
                if (posSec > fullSec) posSec = fullSec;
            } else if (command.equals("prev")) {
                posSec -= 10;
                if (posSec < 0) posSec = 0;
            }
            
             if (opStartSec <= posSec && posSec <= opEndSec) {
        posSec = opEndSec;
    }
        }

        return secToTime(posSec);
    }

    public int timeToSec(String time) {
        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        return min * 60 + sec;
    }

    public String secToTime(int seconds) {
        int min = seconds / 60;
        int sec = seconds % 60;
        return String.format("%02d:%02d", min, sec);
    }
}