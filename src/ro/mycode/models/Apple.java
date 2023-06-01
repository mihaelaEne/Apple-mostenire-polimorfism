package ro.mycode.models;

public class Apple {
    private String type;
    private String director;
    private int id;

    public Apple(String type, String director,int id) {
        this.type = type;
        this.director = director;
        this.id=id;
    }

    public Apple(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String text="";
        text+="Eu sunt un produs apple cu urmatoatrele proprietati:"+"\n";
        text+="Type: "+this.type+"\n";
        text+="Director: "+this.director+"\n";
        text+="Id: "+this.id;
        return text;
    }

    public Apple(String prop){
        String [] split=prop.split(",");
        this.type=split[0];
        this.director=split[1];
        this.id=Integer.parseInt(split[2]);
    }

    public String toSave(){
        return type+","+director+","+id;
    }
}
