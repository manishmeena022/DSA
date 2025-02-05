public class SetMetrixZero {

    private static int[][] metrixZero(int arr[][]){
        boolean[] rows = new boolean[arr.length];
        boolean[] cols = new boolean[arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            if(rows[i]){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j] = 0;
                }
            }
        }

        for(int j=0;j<arr[0].length;j++){
            if(cols[j]){
                for(int i=0;i< arr.length;i++){
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }

    private static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void matrixZ(int arr[][]){
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Determine if the first row or first column needs to be zeroed
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Use the first row and column as markers
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0; // Mark the first cell of the row
                    arr[0][j] = 0; // Mark the first cell of the column
                }
            }
        }

        // Step 3: Zero out cells based on markers
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;
            }
        }

        // Step 5: Zero out the first column if needed
        if (firstColZero) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,1,1}, {1,0,1}, {1,1,1}};

        printArr(matrix);

        int ans[][] = metrixZero(matrix);

        printArr(ans);
    }
}