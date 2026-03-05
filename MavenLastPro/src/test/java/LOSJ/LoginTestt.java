package LOSJ;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginTestt {

    private static final Logger log =
        LoggerFactory.getLogger(LoginTestt.class);

    public void login() {
        log.info("Login test started");
        log.warn("This is a warning message");
        log.error("Login failed due to invalid credentials");
    }
}