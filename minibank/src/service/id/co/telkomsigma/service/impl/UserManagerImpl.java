package id.co.telkomsigma.service.impl;

import java.util.List;

import org.acegisecurity.userdetails.UsernameNotFoundException;
import id.co.telkomsigma.dao.UserDao;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.service.UserExistsException;
import id.co.telkomsigma.service.UserManager;
import org.springframework.dao.DataIntegrityViolationException;


/**
 * Implementation of UserManager interface.</p>
 * 
 * <p>
 * <a href="UserManagerImpl.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class UserManagerImpl extends BaseManager implements UserManager {
    private UserDao dao;

    /**
     * Set the Dao for communication with the data layer.
     * @param dao
     */
    public void setUserDao(UserDao dao) {
        this.dao = dao;
    }

    /**
     * @see id.co.telkomsigma.service.UserManager#getUser(java.lang.String)
     */
    public User getUser(String userId) {
        return dao.getUser(new Long(userId));
    }

    /**
     * @see id.co.telkomsigma.service.UserManager#getUsers(id.co.telkomsigma.model.User)
     */
    public List getUsers(User user) {
        return dao.getUsers(user);
    }

    /**
     * @see id.co.telkomsigma.service.UserManager#saveUser(id.co.telkomsigma.model.User)
     */
    public void saveUser(User user) throws UserExistsException {
    	// if new user, lowercase userId
    	if (user.getVersion() == null) {
            user.setUsername(user.getUsername().toLowerCase());
    	}
        try {
            dao.saveUser(user);
        } catch (DataIntegrityViolationException e) {
            throw new UserExistsException("User '" + user.getUsername() + "' already exists!");
        }
    }

    /**
     * @see id.co.telkomsigma.service.UserManager#removeUser(java.lang.String)
     */
    public void removeUser(String userId) {
        if (log.isDebugEnabled()) {
            log.debug("removing user: " + userId);
        }

        dao.removeUser(new Long(userId));
    }

    public User getUserByUsername(String username) throws UsernameNotFoundException {
        return (User) dao.loadUserByUsername(username);
    }
}
