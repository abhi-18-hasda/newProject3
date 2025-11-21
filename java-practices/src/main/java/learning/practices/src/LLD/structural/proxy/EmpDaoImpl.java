package learning.practices.src.LLD.structural.proxy;

public class EmpDaoImpl implements EmpDao{

    @Override
    public void createEmp(EmpDo obj) {
       System.out.println("Creating an object: "+ obj);
    }

    @Override
    public void getEmpInfo(int empId) {
       System.out.println("Getting an emp by emp id: "+ empId);
    }

}
