package in.mapping.many2many.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.mapping.many2many.model.Employee;
import in.mapping.many2many.util.HibernateUtil;

public class EmployeeDao {

	public void insertEmployee(Employee employee) {

		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction =session.beginTransaction();
			session.save(employee);
			transaction.commit();
			
		}catch(Exception e)
		{
				
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		
	
		
	
		
	}

}
