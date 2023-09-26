package builder;

public class UserBuilder {

    private User user;

    public UserBuilder() {
        this.user = new User();
    }

    public User build() {
        if (user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email inválido");
        }

        if (user.getPassword().isEmpty()) {
            throw new IllegalArgumentException("Senha inválida");
        }

        return this.user;
    }

    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    public UserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
        user.setPhoneNumber(phoneNumber);
        return this;
    }

}
