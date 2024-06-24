
public class _03_Preserve_Whole_Object {
    static class Today{
        int getLow() { return 0; }
        int getHigh() { return 0; }
    }
    
    static void calcLowHigh() {
        Today today = new Today();
        int low = today.getLow();
        int high = today.getHigh();
        
        checkWeatherOld(low, high);
    }
    
    static void checkWeatherOld(int low, int high) {}
    static void checkWeatherNew(Today today) {}
}
