package id.co.telkomsigma.dao.hibernate.minibank;

import java.util.List;

import id.co.telkomsigma.dao.hibernate.BaseDaoHibernate;
import id.co.telkomsigma.dao.minibank.TestDao;
import id.co.telkomsigma.model.minibank.Test;

public class TestDaoHibernate extends BaseDaoHibernate implements TestDao{

	@Override
	public List getAll() {
		return getHibernateTemplate().loadAll(Test.class);
	}

}
