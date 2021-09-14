import java.util.Scanner;

public class RoomCalculator {

    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is the length of the room in feet?");
        int roomLength = sc.nextInt();
        System.out.println("what is the width of the room in feet?");
        int roomWidth = sc.nextInt();

        int area = roomLength * roomLength;
        System.out.println("the area is");
        System.out.println(area + " Square feet");

        double areaMeters = area/10.764;
        System.out.println(areaMeters + "Square meters");


    }

}
