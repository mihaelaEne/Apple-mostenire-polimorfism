package ro.mycode.models;

public class Laptop extends Apple {

    private String procesor;
    private int memorie;

    public Laptop(String type, String director, int id, String procesor, int memorie) {
        super(type, director, id);
        this.procesor = procesor;
        this.memorie = memorie;
    }

    public Laptop(String procesor, int memorie) {
        this.procesor = procesor;
        this.memorie = memorie;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public int getMemorie() {
        return memorie;
    }

    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }

    @Override
    public String toString(){
        String text="";
        text+="Eu sunt un ceas de la Apple cu urmatoarele caracteristici"+"\n";
        text+= "type: "+super.getType()+"\n";
        text+="director: "+super.getDirector()+"\n";
        text+="id: "+super.getId()+"\n";
        text+="procesor: "+this.procesor+"\n";
        text+="memorie: "+this.memorie;
        return text;
    }
    public Laptop(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.procesor=split[3];
        this.memorie=Integer.parseInt(split[4]);
    }
}
