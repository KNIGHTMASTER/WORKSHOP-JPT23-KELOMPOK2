package id.co.telkomsigma.service.impl.minibank;

import java.util.List;

import id.co.telkomsigma.dao.minibank.CIFDao;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.service.impl.BaseManager;
import id.co.telkomsigma.service.minibank.CIFManager;


public class CIFManagerImpl extends BaseManager implements CIFManager {
	
	private CIFDao cifDao;
	
	/**
	 * @return the cifDao
	 */
	public CIFDao getCifDao() {
		return cifDao;
	}

	/**
	 * @param cifDao the cifDao to set
	 */
	public void setCifDao(CIFDao cifDao) {
		this.cifDao = cifDao;
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.CIFManager#actionGetCIF(java.lang.Long)
	 */
	@Override
	public CIF actionGetCIF(Long cifId) {
		return this.getCifDao().actionGetCIF(cifId);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.CIFManager#actionLoadCIFByNumber(java.lang.String)
	 */
	@Override
	public CIF actionLoadCIFById(Long cifId) {
		return this.getCifDao().actionGetCIF(cifId);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.CIFManager#actionSave(id.co.telkomsigma.model.minibank.CIF)
	 */
	@Override
	public void actionSave(CIF cif) {
		this.getCifDao().actionSave(cif);
	}

	/* (non-Javadoc)
	 * @see id.co.telkomsigma.service.minibank.CIFManager#actionLoadCIFALL()
	 */
	@Override
	public List<CIF> actionLoadCIFALL() {
		return this.getCifDao().actionGetCIFAll();
	}
	
	public CIF actionLoadCIFByUser(User user){
		return this.getCifDao().actionLoadCIFByUser(user);				
	}
}
