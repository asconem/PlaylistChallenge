package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int counterUp = 0;
        int counterDown = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (!(playList[i % playList.length].equals(selection))) {
                counterUp++;
            } else {
                break;
            }
        }
        for (int i = startIndex; i >= 0; i--) {
            if (!(playList[i % playList.length].equals(selection))) {
                counterDown++;
            } else {
                break;
            }
        }
        if (counterUp > counterDown) {
            return counterDown;
        }
        return counterUp;
    }
}
