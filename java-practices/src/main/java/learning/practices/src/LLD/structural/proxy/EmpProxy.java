package learning.practices.src.LLD.structural.proxy;

import com.oracle.svm.core.posix.headers.SysParam;

public class EmpProxy implements EmpDao{

    private EmpDao dao;
    private String clientRole;

    public EmpProxy(String clientRole){
        dao = new EmpDaoImpl();
        this.clientRole = clientRole;

    }
    @Override
    public void createEmp(EmpDo obj) {
        if(clientRole.equalsIgnoreCase("ADMIN")){
            dao.createEmp(obj);
        }else{
            System.out.println("Access Denied");
        }
    }

    @Override
    public void getEmpInfo(int empId) {
        if(clientRole.equalsIgnoreCase("ADMIN") ||clientRole.equalsIgnoreCase("USER")){
            dao.getEmpInfo(empId);
        }else{
            System.out.println("Access Denied");
        }
    }

}
