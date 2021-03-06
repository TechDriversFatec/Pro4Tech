package modelo;

public class Projeto {
    private int codProjeto;
    private String nomeProjeto;
    private String empresaProjeto;

    public Projeto(int codProjeto, String nomeProjeto, String empresaProjeto) {
        this.codProjeto = codProjeto;
        this.nomeProjeto = nomeProjeto;
        this.empresaProjeto = empresaProjeto;
    }

    public Projeto(String nomeProjeto, String empresaProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.empresaProjeto = empresaProjeto;
    }
    
    public int getCodProjeto() {
        return codProjeto;
    }

    public void setCodProjeto(int codProjeto) {
        this.codProjeto = codProjeto;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getEmpresaProjeto() {
        return empresaProjeto;
    }

    public void setEmpresaProjeto(String empresaProjeto) {
        this.empresaProjeto = empresaProjeto;
    }
    
    
}
