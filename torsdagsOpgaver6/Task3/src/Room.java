public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }

    public int getNumberOfLamps() {

        return this.numberOfLamps;

    }

    public int getNumberOfWindows() {

        return this.numberOfWindows;

    }

    public void setNumberOfLamps(int numberOfLamps) {

        this.numberOfLamps = numberOfLamps;

    }

    public void setNumberOfWindows(int numberOfWindows) {

        this.numberOfWindows = numberOfWindows;

    }


}