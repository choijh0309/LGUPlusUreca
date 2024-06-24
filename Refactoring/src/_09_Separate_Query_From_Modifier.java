
public class _09_Separate_Query_From_Modifier {
    // Old
    public static String getUserNameChangeUserState(int userId) {
    	// 사용자 이름도 전달, 사용자의 상태값도 변경
        return "userName"; 
    }
       
    // New
    public static String getUserName() {
        return "userName"; 
    }
    
    public void changeUserState() {}
}