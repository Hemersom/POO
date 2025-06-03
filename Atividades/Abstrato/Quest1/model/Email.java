public class Email extends Contato {
    private String email;

    public Email(String email) {
        this.email = email;
    }
    public Email() {
        this.email = "";
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
