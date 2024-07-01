package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int i=1; i<=tableSize;i++){
            //result+="";
            for(int j=1;j<=tableSize;j++){
                //result += ""+j*i+"|";
                result+=String.format("%3d |",i*j);
            }
            result+="\n";
        }

        return result;
    }
}
