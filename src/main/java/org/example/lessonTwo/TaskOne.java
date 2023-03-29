package org.example.lessonTwo;

public class TaskOne {

    public static void main(String[] args) {
        int[] centerCoordinates = {-2, 5};
        int radius = 16;
        int[] dotCoordinates = {-10, -15};

        checkDots(centerCoordinates, radius, dotCoordinates);
    }

    public static void checkDots (int[] centerCoordinate, int radius, int[] dotCoordinates) {
        int x = Math.abs(dotCoordinates[0] - centerCoordinate[0]);
        int y = Math.abs(dotCoordinates[1] - centerCoordinate[1]);

        if (x <= radius && y <= radius) {
            System.out.println("Точка в круге");
        }
        else {
            System.out.println("Точка вне круга");
        }
    }



}
