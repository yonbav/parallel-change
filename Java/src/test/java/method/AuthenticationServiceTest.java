package method;

import com.pduda.method.AuthenticationService;
import org.junit.Assert;
import org.junit.Test;

public class AuthenticationServiceTest {

    @Test
    public void administratorIsAlwaysAuthenticated() {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void normalUserIsNotAuthenticatedInitially() {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }

}
