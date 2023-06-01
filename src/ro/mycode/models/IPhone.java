package ro.mycode.models;

public class IPhone extends Apple {
    private String model;
    private int nrCamereFoto;

    public IPhone(String type, String director, int id, String model, int nrCamereFoto) {
        super(type, director, id);
        this.model = model;
        this.nrCamereFoto = nrCamereFoto;
    }

    public IPhone(String model, int nrCamereFoto) {
        this.model = model;
        this.nrCamereFoto = nrCamereFoto;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrCamereFoto() {
        return nrCamereFoto;
    }

    public void setNrCamereFoto(int nrCamereFoto) {
        this.nrCamereFoto = nrCamereFoto;
    }

    @Override
    public String toString(){
        String text="";
        text+="Eu sunt un ceas de la Apple cu urmatoarele caracteristici"+"\n";
        text+= "type: "+super.getType()+"\n";
        text+="id: "+super.getId()+"\n";
        text+="director: "+super.getDirector()+"\n";
        text+="model: "+this.model+"\n";
        text+="nr camere foto: "+this.nrCamereFoto;
        return text;
    }
    public IPhone(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.model=split[3];
        this.nrCamereFoto=Integer.parseInt(split[4]);
    }
}
