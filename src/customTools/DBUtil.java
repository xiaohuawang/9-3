package customTools;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class DBUtil
{
	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("ServletDBAssignment");
	
	public static EntityManagerFactory getEmFactory()
	{
		return emf;
	}
}
