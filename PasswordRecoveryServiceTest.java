package Trial;
/*
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PasswordRecoveryServiceTest {

    @Mock
    private PasswordRecoveryRepository passwordRecoveryRepository;

    @InjectMocks
    private PasswordRecoveryService passwordRecoveryService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInitiatePasswordRecovery() {
        String emailOrMobile = "test@example.com";
        passwordRecoveryService.initiatePasswordRecovery(emailOrMobile);
        // Verify that the recovery process is initiated correctly
    }

    @Test
    public void testValidateResetToken_ValidToken() {
        String token = "secureToken123";
        when(passwordRecoveryRepository.findByToken(token)).thenReturn(new PasswordRecovery());

        boolean isValid = passwordRecoveryService.validateResetToken(token);

        assertTrue("Token should be valid", isValid);
    }

    @Test
    public void testResetPassword_Success() {
        String token = "secureToken123";
        String newPassword = "newPassword";
        PasswordRecovery recovery = new PasswordRecovery();
        recovery.setToken(token);
        recovery.setTokenUsed(false);

        when(passwordRecoveryRepository.findByToken(token)).thenReturn(recovery);

        passwordRecoveryService.resetPassword(token, newPassword);

        assertTrue("Token should be marked as used", recovery.isTokenUsed());
        verify(passwordRecoveryRepository, times(1)).save(recovery);
    }
}
*/
