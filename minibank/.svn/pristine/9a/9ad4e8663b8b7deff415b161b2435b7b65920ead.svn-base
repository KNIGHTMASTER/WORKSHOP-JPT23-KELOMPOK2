package id.co.telkomsigma.webapp.action.minibank;

import java.util.List;

import org.acegisecurity.Authentication;
import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.context.SecurityContext;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;
import org.apache.tapestry.IRequestCycle;

import id.co.telkomsigma.Constants;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.model.minibank.Account;
import id.co.telkomsigma.model.minibank.CIF;
import id.co.telkomsigma.service.UserManager;
import id.co.telkomsigma.service.minibank.AccountManager;
import id.co.telkomsigma.service.minibank.CIFManager;
import id.co.telkomsigma.webapp.action.BasePage;

public abstract class AccountList extends BasePage {

	public abstract UserManager getUserManager();

	public abstract CIFManager getCIFManager();

	public abstract AccountManager getAccountManager();

	@SuppressWarnings("rawtypes")
	public List getAccountList() {
		if (!this.getPage().getPageName().equals("accountList")) {
			SecurityContext ctx = SecurityContextHolder.getContext();
			System.out.println("CTX............ = " + ctx.getAuthentication());

			String currentUser = null;
			if (ctx.getAuthentication() != null) {
				Authentication auth = ctx.getAuthentication();
				System.out.println("AUTH............ = " + auth);
				boolean administrator = false;
				GrantedAuthority[] roles = auth.getAuthorities();
				for (int i = 0; i < roles.length; i++) {
					if (roles[i].getAuthority().equals(Constants.ADMIN_ROLE)) {
						administrator = true;
						break;
					}
				}

				if (auth.getPrincipal() instanceof UserDetails) {
					currentUser = ((UserDetails) auth.getPrincipal())
							.getUsername();
					System.out.println("currentUser........ = " + currentUser);
				} else {
					currentUser = String.valueOf(auth.getPrincipal());
					System.out.println("currentUser........ = " + currentUser);
				}
			}
			User user = getUserManager().getUserByUsername(currentUser);
			CIF cif = getCIFManager().actionLoadCIFByUser(user);
			List<Account> accounts = getAccountManager()
					.actionGetAllAccountByCif(cif);
		}
		return getAccountManager().actionGetAll();
	}

	public void edit(IRequestCycle cycle) {
		AccountForm nextPage = (AccountForm) cycle.getPage("accountForm");
		Object[] parameters = cycle.getListenerParameters();
		Long id = (Long) parameters[0];

		if (log.isDebugEnabled()) {
			log.debug("fetching Account with id : " + id);
		}

		Account accountRetrieved = getAccountManager().actionGetAccount(id);
		nextPage.setAccount(accountRetrieved);
		cycle.activate(nextPage);
	}

}
