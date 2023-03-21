public class User {
    private String name;
    private String email;
    private String cpf;
    private Degree degree = new Degree();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(this.name != "") {
            return;
        }

        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if(this.cpf != "") {
            return;
        }

        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if(this.email != "") {
            return;
        }

        this.email = email;
    }
}
