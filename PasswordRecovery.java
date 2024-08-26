package Trial;
import java.util.Date;


public class PasswordRecovery {

    private int recoveryId;  // Primary key for the recovery table
    private int customerId;  // Foreign key from the Customer table
    private String token;  // Unique token for password reset
    private Date tokenCreationDate;  // Timestamp of when the token was created
    private Date tokenExpirationDate;  // Timestamp of when the token will expire
    private boolean isTokenUsed;  // Indicates whether the token has been used

    // Getters and setters for each field
    public int getRecoveryId() {
        return recoveryId;
    }

    public void setRecoveryId(int recoveryId) {
        this.recoveryId = recoveryId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getTokenCreationDate() {
        return tokenCreationDate;
    }

    public void setTokenCreationDate(Date tokenCreationDate) {
        this.tokenCreationDate = tokenCreationDate;
    }

    public Date getTokenExpirationDate() {
        return tokenExpirationDate;
    }

    public void setTokenExpirationDate(Date tokenExpirationDate) {
        this.tokenExpirationDate = tokenExpirationDate;
    }

    public boolean isTokenUsed() {
        return isTokenUsed;
    }

    public void setTokenUsed(boolean isTokenUsed) {
        this.isTokenUsed = isTokenUsed;
    }
}
