package br.com.devsgeeknerd.com.consultorio;

public class Dentista {
    private String nome;
    private String sobrenome;
    private String especialidade;
    private String inscricaoCRO;
    private boolean estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
