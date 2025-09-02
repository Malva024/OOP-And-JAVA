package Hostel_Management;

public class Warden {
    public static String name;

    public Warden(String name) {
        this.name = name;
    }

    public static void allocateRoom(String resident, int roomNumber, boolean isAllocated) {
        if (!isAllocated) {
            Room.allocate();
            System.out.println("Warden " + name + " allocated room No." + roomNumber + " to " + resident);
        } else {
            System.out.println("Room is already allocated.");
        }
    }
}
