import java.util.Date;

public class _01_Parameter_Object {
	// Old
    static class CustomerOld{
        public int getOrderAmount(Date from, Date to) { return 0; }
        
        public int getCancelAmount(Date from, Date to) { return 0; }
        
        public int getCartAmount(Date from, Date to) { return 0; }
    }
    
 // New
    static class CustomerNew{
        public int getOrderAmount(FromTo fromTo) { return 0; }
        
        public int getCancelAmount(FromTo fromTo) { return 0; }
        
        public int getCartAmount(FromTo fromTo) { return 0; }
    }
    
    static class FromTo{
    	Date from;
    	Date to;
    }
}
