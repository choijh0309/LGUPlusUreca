
public class _07_Reverse_Conditional {
    public static boolean isEven(int num) { return false; }
    public static boolean isOdd(int num) { return false; }
    
    // Old
    public static void calcOld(int num) {
        if( !isEven(num) ) {
            
        }else {
            
        }
    }
    
    // New
    public static void calcNew(int num) {
        if( isOdd(num) ) {
            
        }else {
            
        }
    }
}