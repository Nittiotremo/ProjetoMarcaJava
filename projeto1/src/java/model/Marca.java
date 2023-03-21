package model;

public class Marca {

    private int codigomarca;
    private String nomemarca;
    
    public Marca(){
    
    }
    
    public Marca(int codigopessoa, String nomemarca){
    this.codigomarca = codigomarca;
    this.nomemarca = nomemarca;
    }

    public int getCodigomarca() {
        return codigomarca;
    }

    public void setCodigomarca(int codigomarca) {
        this.codigomarca = codigomarca;
    }

    public String getNomemarca() {
        return nomemarca;
    }

    public void setNomemarca(String nomemarca) {
        this.nomemarca = nomemarca;
    }

}
