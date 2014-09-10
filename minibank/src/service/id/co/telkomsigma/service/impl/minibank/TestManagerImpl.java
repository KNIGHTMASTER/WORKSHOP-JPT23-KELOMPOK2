package id.co.telkomsigma.service.impl.minibank;

import java.util.List;

import id.co.telkomsigma.dao.minibank.TestDao;
import id.co.telkomsigma.service.impl.BaseManager;
import id.co.telkomsigma.service.minibank.TestManager;

public class TestManagerImpl extends BaseManager implements TestManager {
	
	TestDao testDao;
	
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	public TestDao getTestDao() {
		return testDao;
	}

	@Override
	public List getAllList() {
		// TODO Auto-generated method stub
		return this.getTestDao().getAll();
	}
}
