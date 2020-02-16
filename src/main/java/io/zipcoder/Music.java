package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    /*protected boolean found(Integer index, String selection) {
        try {

            if (index < 0) {
                index = playList.length + index;
            } else if (index >= playList.length) {
                index = index % playList.length;
            }
            return playList[index].equals(selection);
        } catch (Exception e) {
            return false;
        }
    }*/

    public Integer selection(Integer startIndex, String selection) {
        /*int diff = 0;
        for (int i = 0; i < playList.length; i++) {
            if (found(startIndex - i, selection) || found(startIndex + i, selection)) {
                diff = i;
                return diff;
            }
        }

        return diff;*/


        int counterUp = 1;
        int counterDown = 1;
        for (int i = 1; i < playList.length; i++) {
            if (!(playList[(startIndex + i) % playList.length].equals(selection))) {
                counterUp++;
            } else {
                break;
            }
        }
        for (int i = 1; i < playList.length; i++) {
            if (!(playList[((startIndex - i) + playList.length) % playList.length].equals(selection))) {
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
