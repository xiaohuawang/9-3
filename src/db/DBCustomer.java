package db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import customTools.DBUtil;

import model.DemoCustomer;

public class DBCustomer
{
	public static List<DemoCustomer> getAllCustomers()
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String queryStr = "SELECT e FROM DemoCustomer e";
		List<DemoCustomer> customers = null;
		try
		{
			Query query = em.createQuery(queryStr);
			customers =  query.getResultList();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return customers;
	}
	
	public static DemoCustomer getCustomer(long customerId)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try
		{
			DemoCustomer customer = em.find(DemoCustomer.class, customerId);
			return customer;
		}
		finally
		{
			em.close();
		}
	}
}
