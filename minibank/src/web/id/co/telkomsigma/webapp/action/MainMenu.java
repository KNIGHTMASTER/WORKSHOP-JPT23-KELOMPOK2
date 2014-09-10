package id.co.telkomsigma.webapp.action;

import org.apache.tapestry.IRequestCycle;
import id.co.telkomsigma.model.User;
import id.co.telkomsigma.service.UserManager;

public abstract class MainMenu extends BasePage {
    public abstract UserManager getUserManager();

    public void editProfile(IRequestCycle cycle) {
        UserForm nextPage = (UserForm) cycle.getPage("userForm");
        String username = getRequest().getRemoteUser();

        if (log.isDebugEnabled()) {
            log.debug("fetching user profile: " + username);
        }

        User user = getUserManager().getUserByUsername(username);
        user.setConfirmPassword(user.getPassword());
        nextPage.setUser(user);
        nextPage.setFrom("mainMenu");
        cycle.activate(nextPage);
    }
}
