
public class _04_Consolidate_Conditional_Expression {
	// Old
    public void registerOld(String userName, String userPassword, String userEmail) {
        if( userName.contains("aaa")) stopRegister();
        if( userPassword.contains("bbb")) stopRegister();
        if( userEmail.contains("ccc")) stopRegister();
        doRegister();
    }
    
    public void stopRegister() {}
    public void doRegister() {}
    
    // New
    public void registerNew(String userName, String userPassword, String userEmail) {
        if( registerValidate(userName, userPassword, userEmail)) doRegister();
        stopRegister();
    }
    
    public boolean registerValidate(String userName, String userPassword, String userEmail) {
    	if( userName.contains("aaa")) return false;
        if( userPassword.contains("bbb")) return false;
        if( userEmail.contains("ccc")) return false;
        return true;
    }
}
