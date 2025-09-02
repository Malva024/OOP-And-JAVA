package Hostel_Management;

public class Room {
    public static int roomNumber;
    public static String roomType;
    public static boolean isAllocated;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAllocated = false;
    }

    public static void allocate() {
        if (!isAllocated) {
            isAllocated = true;
            System.out.println("Room No. " + roomNumber + " allocated successfully.");
        } else {
            System.out.println("Room No. " + roomNumber + " is already allocated.");
        }
    }

    public static void displayRoom() {
        System.out.println("Room Number: " + roomNumber + "\nType: " + roomType + "\nAvailable: " + !isAllocated);
    }
}
