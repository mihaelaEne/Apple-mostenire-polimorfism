package ro.mycode.models;

public class Ceas extends Apple{
    private String model;
    private String culoareCurea;

    public Ceas(String type, String director, int id, String model, String culoareCurea) {
        super(type, director, id);
        this.model = model;
        this.culoareCurea = culoareCurea;
    }

    public Ceas(String model, String culoareCurea) {
        this.model = model;
        this.culoareCurea = culoareCurea;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloareCurea() {
        return culoareCurea;
    }

    public void setCuloareCurea(String culoareCurea) {
        this.culoareCurea = culoareCurea;
    }

    @Override
    public String toString(){
        String text="";
        text+="Eu sunt un ceas de la Apple cu urmatoarele caracteristici"+"\n";
        text+= "type: "+super.getType()+"\n";
        text+="director: "+super.getDirector()+"\n";
        text+="id: "+super.getId()+"\n";
        text+="model: "+this.model+"\n";
        text+="culoare curea: "+this.culoareCurea;
        return text;
    }

    public Ceas(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.model=split[3];
        this.culoareCurea=split[4];
    }

}
