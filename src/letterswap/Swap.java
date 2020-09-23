package letterswap;

final class Swap {
    
    private static String[] swap(String word,int location,String letter) {
        location = location-1;
        final String CREATARRAY[] = CreatArray.getCreatArray(word);
        
        if (location < 0) {
            CREATARRAY[0] = "Error";
            CREATARRAY[1] = "The number " + (location+1) + " is invalid";
            return CREATARRAY;
        }else {
            for (int i = 0;i < CREATARRAY.length;i++) {
            if (i == location) {
                CREATARRAY[location] = letter;
                break;
                
            }
        }
        }
        return CREATARRAY;
    }
    
    private static String[] swap(String word,String oldLetter,String nLetter) {
        final String CREATARRAY[] = CreatArray.getCreatArray(word);
        
        for (int i = 0;i < CREATARRAY.length;i++) {
            if (CREATARRAY[i].equals(oldLetter)) {
                CREATARRAY[i] = nLetter;
                break;
            }
        }
        
        return CREATARRAY;
    }
    
    public static void getSwapAndgetPrint(String word,String oldLetter,String nLetter) {
        PrintWord.getPrintArray(swap(word,oldLetter,nLetter));
    }
    
    public final static void getSwapAndgetPrint(String word,int location,String letter) {
        PrintWord.getPrintArray(swap(word,location,letter));
    }
}