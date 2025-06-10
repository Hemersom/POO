public class Email extends Contato {
    private String email;

    public Email(String email) {
        this.email = email;
        this.tipo = "email";
    }
    public Email() {
        this.email = "";
        this.tipo = "email";
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void exibir() {
        System.out.println("Email: " + email);
    }
}
