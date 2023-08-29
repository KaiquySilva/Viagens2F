public class Turista {

    // Atributos - Variaveis de instancia
    private String nome;
    private String cpf;
    // Construtor Padrão
    Turista(){}
    // Construtor personalizado
    Turista(String _nome){
        this.nome = _nome;
    }

    // Metodos
    public String viajar(){
        return "Viajou!!!";
    }
    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Validar CPF

        this.cpf = cpf;
    }
}
