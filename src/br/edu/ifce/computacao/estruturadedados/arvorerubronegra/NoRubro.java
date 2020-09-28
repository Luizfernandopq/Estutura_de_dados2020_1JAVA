package br.edu.ifce.computacao.estruturadedados.arvorerubronegra;


public class NoRubro {
    private Integer valor;
    private NoRubro pai;
    private NoRubro esq;
    private NoRubro dir;
    private boolean isRubro;

    public NoRubro(Integer valor, NoRubro pai, NoRubro esq, NoRubro dir, boolean isRubro) {
        this.valor = valor;
        this.pai = pai;
        this.esq = esq;
        this.dir = dir;
        this.isRubro = isRubro;
    }


    public Integer getValor() {
        return valor;
    }

    public NoRubro getAvo(){
        if (pai == null){
            return null;
        }
        return pai.getPai();
    }

    public NoRubro getTio(){
        NoRubro avo = getAvo();
        if (avo == null){
            return null;
        }
        if (avo.isHigher(pai)){
            return avo.getDir();
        }else{
            return avo.getEsq();
        }
    }

    public NoRubro getIrmao(){
        if (this.pai == null){
            return null;
        }
        if (isHigher(pai)){
            return pai.esq;
        }else{
            return pai.dir;
        }
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public NoRubro getPai() {
        return pai;
    }

    public void setPai(NoRubro pai) {
        this.pai = pai;
    }

    public NoRubro getEsq() {
        return esq;
    }

    public void setEsq(NoRubro esq) {
        this.esq = esq;
    }

    public NoRubro getDir() {
        return dir;
    }

    public void setDir(NoRubro dir) {
        this.dir = dir;
    }

    public boolean isRubro() {
        return isRubro;
    }

    public void setRubro(boolean rubro) {
        isRubro = rubro;
    }

    public String getCor(){
        if (isRubro()){
            return "Rubro";
        }
        return "Negro";
    }

    public boolean isHigher(NoRubro no){
        return this.valor > no.getValor();
    }
}
