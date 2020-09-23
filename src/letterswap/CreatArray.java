package letterswap;

final class CreatArray {
    
    private static String[] creatArray(String word) {
        final String WORDARRAY[] = new String[word.length()];
        
        for (int i = 0;i < WORDARRAY.length;i++) {
            WORDARRAY[i] = word.substring(i,i+1);
        }
        
        return WORDARRAY;
    }
    
    public final static String[] getCreatArray(String word) {
        return creatArray(word);
    }
}