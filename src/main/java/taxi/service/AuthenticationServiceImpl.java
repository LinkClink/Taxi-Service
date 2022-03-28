package taxi.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthenticationException;
import taxi.lib.Injector;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverService driverService
            = (DriverService) injector.getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Driver exitDriver = driverService.findByLogin(login);
        if (exitDriver != null && exitDriver.getPassword().equals(password)) {
            logger.info("Success login with login: {}", login);
            return exitDriver;
        }
        logger.warn("Authentication failed with login: {}", login);
        throw new AuthenticationException("Wrong password or login");
    }
}
