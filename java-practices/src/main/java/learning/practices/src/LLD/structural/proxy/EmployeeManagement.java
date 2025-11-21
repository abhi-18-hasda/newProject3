package learning.practices.src.LLD.structural.proxy;

public class EmployeeManagement {
    public static void main(String[] args) {
        System.out.println("+++++++++Proxy design pattern++++++++++");
        EmpDao dao = new EmpProxy("USER");
        dao.getEmpInfo(2);
        dao.createEmp(new EmpDo());
    }
}
