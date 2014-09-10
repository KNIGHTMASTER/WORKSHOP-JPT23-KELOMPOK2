package id.co.telkomsigma.dao.hibernate.minibank;


import java.util.List;

import id.co.telkomsigma.dao.hibernate.BaseDaoHibernate;
import id.co.telkomsigma.dao.minibank.CIFDao;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.model.minibank.CIF;

public class CIFDaoHibernate extends BaseDaoHibernate implements CIFDao {

	/**
	 * (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.CIFDao#actionGetCIF(java.lang.Long)
	 * @param Long CIF.Id
	 * @return Object CIF
	 * @function this method used to save retrieved from database by CIF.Id
	 */
	@Override
	public CIF actionGetCIF(Long cifId) {
		// TODO Auto-generated method stub
		return (CIF)getHibernateTemplate().get(CIF.class, cifId);
	}

	/**
	 * (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.CIFDao#actionLoadCIFByNumber(java.lang.String)
	 * @param String CIF.Number
	 * @return Object CIF
	 * @function this method used to save retrieved from database by CIF.number
	 */
	@Override
	public CIF actionLoadCIFByNumber(String cifNumber) {
		// TODO Auto-generated method stub
		return (CIF)getHibernateTemplate().get(CIF.class, cifNumber);
	}

	/**
	 *  (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.CIFDao#actionSave(id.co.telkomsigma.model.minibank.CIF)
	 * @param Object cif
	 * @function this method used to save cif
	 */
	@Override
	public void actionSave(CIF cif) {
		// TODO Auto-generated method stub
		if(cif!=null){
			getHibernateTemplate().saveOrUpdate(cif);
			getHibernateTemplate().flush();
		}
	}

	/**
	 *  (non-Javadoc)
	 * @see id.co.telkomsigma.dao.minibank.CIFDao#actionGetCIFAll()
	 * @return list CIF
	 * @function this method load all Object CIF
	 */
	@Override
	public List<CIF> actionGetCIFAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().loadAll(CIF.class);
	}
	
	public CIF actionLoadCIFByUser(User user){
		return (CIF)getHibernateTemplate().find("from CIF where fk_user_id = ?",user.getId());
	}
	
}
