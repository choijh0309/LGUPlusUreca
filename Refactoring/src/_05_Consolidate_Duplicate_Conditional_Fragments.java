
public class _05_Consolidate_Duplicate_Conditional_Fragments {
    
    public static void sendToCustomer(int customerId, int price) {  }
    
    public static int getSaledPrice() { return 0; }
    public static int getRegularPrice() { return 0; }
    
    public static boolean isTodayInSale() { return false; }
    
    
    // Old
    public static void calculatePriceOld() {
        int customerId = 100;
        int price = 0;
        
        if( isTodayInSale() ) {
            price = getSaledPrice();
            sendToCustomer(customerId, price);
        }else {
            price = getRegularPrice();
            sendToCustomer(customerId, price);
        }
    }
    
    // New
    public static void calculatePriceNew() {
        int customerId = 100;
        int price = 0;
        
//        if( isTodayInSale() ) {
//            price = getSaledPrice();
//        }else {
//            price = getRegularPrice();
//        }
        // 3항 연산자 조건 ? _ : _
        price = isTodayInSale() ? getSaledPrice() : getRegularPrice();
        sendToCustomer(customerId, price);
    }
    
}