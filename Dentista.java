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

    public String getInscricaoCRO() {
        return inscricaoCRO;
    }

    public void setInscricaoCRO(String inscricaoCRO) {
        this.inscricaoCRO = inscricaoCRO;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Dentista(String nome, String sobrenome, String especialidade, String inscricaoCRO, boolean estado) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.especialidade = especialidade;
        this.inscricaoCRO = inscricaoCRO;
    }

}
