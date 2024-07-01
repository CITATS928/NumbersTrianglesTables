package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        //call getRow()

        String str = "";
        for (int j = 1; j < numberOfRows; j++) {
            str += getRow(j) + "\n";
        }
        return str;
    }

    public static String getRow(int numberOfStars) {
        String str = "";
        for (int i = 0; i < numberOfStars; i++) {
            str += "*";
        }
        return str;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
