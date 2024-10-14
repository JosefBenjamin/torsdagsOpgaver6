import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room roomOne = new Room(2, 1);
        Room roomTwo = new Room(4, 2);
        Room roomThree = new Room(6, 4);

        ArrayList<Room> newRooms = new ArrayList<Room>();
        newRooms.add(roomOne);
        newRooms.add(roomTwo);
        newRooms.add(roomThree);

        Building firstBuilding = new Building(newRooms, 4);

        System.out.println(countLampsInBuilding(firstBuilding));
        System.out.println(countWindowsInBuilding(firstBuilding));
        System.out.println(countRoomsInBuilding(firstBuilding));
        System.out.println(isNormal(firstBuilding));

    }

    private static int countLampsInBuilding(Building building) {

        int totalLampsInBuilding = 0;

        for(Room rooms : building.getRooms()) {
            totalLampsInBuilding += rooms.getNumberOfLamps();
        }

        return totalLampsInBuilding;

    }

    private static int countWindowsInBuilding(Building building) {

        int totalWindowsInBuilding = 0;

        for(Room rooms : building.getRooms()) {
            totalWindowsInBuilding += rooms.getNumberOfWindows();
        }

        return totalWindowsInBuilding;

    }

    private static int countRoomsInBuilding(Building building) {

        return building.getRooms().size();

    }

    private static boolean isNormal(Building building) {

        if(building.getNumberOfFloors() >= building.getRooms().size()) {

            return true;
        } else {

            return false;

        }


    }

}
