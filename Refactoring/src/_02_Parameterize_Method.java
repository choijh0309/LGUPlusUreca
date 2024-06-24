
public class _02_Parameterize_Method {
    // Old
    static class EmployeeOld{
        public void raiseSalary10Percentage() {}        
        public void raiseSalary20Percentage() {}        
        public void raiseSalary50Percentage() {}
    }
    
    // New
    static class EmployeeNew{
        public void raiseSalaryPercentage(int percentage) {}    
    }
}
