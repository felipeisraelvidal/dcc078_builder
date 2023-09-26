package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserBuilderTest {

    @Test
    public void shouldReturnInvalidEmailException() {
        try {
            UserBuilder userBuilder = new UserBuilder();
            User user = userBuilder
                    .setPassword("123456")
                    .setPhoneNumber("32999999999")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Email inválido", e.getMessage());
        }
    }

    @Test
    public void shouldReturnInvalidPasswordException() {
        try {
            UserBuilder userBuilder = new UserBuilder();
            User user = userBuilder
                    .setEmail("teste@teste.com")
                    .setPhoneNumber("32999999999")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Senha inválida", e.getMessage());
        }
    }

    @Test
    public void shouldReturnValidUser() {
        UserBuilder userBuilder = new UserBuilder();
        User user = userBuilder
                .setEmail("teste@teste.com")
                .setPassword("123456")
                .setPhoneNumber("32999999999")
                .build();

        assertNotNull(user);
    }

}
