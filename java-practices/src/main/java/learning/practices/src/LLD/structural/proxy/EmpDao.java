package learning.practices.src.LLD.structural.proxy;

public interface EmpDao {
    public abstract void createEmp(EmpDo obj);
    public abstract void getEmpInfo(int empId);
}
