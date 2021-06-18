package in.mapping.many2many.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.mapping.many2many.model.Project;
import in.mapping.many2many.util.HibernateUtil;

public class ProjectDao {

	public void insertProject(Project project) {

		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			transaction =session.beginTransaction();
			session.save(project);
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
