package id.co.telkomsigma.dao.hibernate;

import java.util.List;

import id.co.telkomsigma.dao.LookupDao;


/**
 * Hibernate implementation of LookupDao.
 *
 * <p><a href="LookupDaoHibernate.java.html"><i>View Source</i></a></p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class LookupDaoHibernate extends BaseDaoHibernate implements LookupDao {

    /**
     * @see id.co.telkomsigma.dao.LookupDao#getRoles()
     */
    public List getRoles() {
        log.debug("retrieving all role names...");

        return getHibernateTemplate().find("from Role order by name");
    }
}
