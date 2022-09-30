package Tugas2;

public class Insertion {
    public void insertionSortString(String[] data, double[] list) {
        int n = data.length;

        for(int j=1; j<n; j++) {
            int d=j;
            while(d>0 && data[d].compareTo(data[d-1]) < 0) {
                String swap = data[d];
                double swip = list[d];
                data[d] = data[d-1];
                list[d] = list[d-1];
                data[d-1] = swap;
                list[d-1] = swip;
                d--;
            }
        }
    }

    public void insertionSortDouble(double[] data, String[] list) {
        int n = data.length;

        for(int j=1; j<n; j++) {
            int d=j;
            while(d>0 && data[d] < data[d-1]) {
                double swap = data[d];
                String swip = list[d];
                data[d] = data[d-1];
                list[d] = list[d-1];
                data[d-1] = swap;
                list[d-1] = swip;
                d--;
            }
        }
    }
}
