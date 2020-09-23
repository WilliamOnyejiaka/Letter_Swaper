package letterswap;

final class PrintWord {
    
    private static void printArray(String arr[]) {
        if (arr[0].equals("Error")) {
            System.out.println(arr[1]);
        }else {
            for (int i = 0;i < arr.length-1;i++) {
            System.out.print(arr[i]);
        } 
        System.out.println(arr[arr.length-1]);
        }
    }
    
    public final static void getPrintArray(String arr[]){
        printArray(arr);
    }
}