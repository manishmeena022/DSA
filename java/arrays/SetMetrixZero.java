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

    public static void main(String args[]){
        int matrix[][] = {{1,1,1}, {1,0,1}, {1,1,1}};

        int ans[][] = metrixZero(matrix);
    }
}