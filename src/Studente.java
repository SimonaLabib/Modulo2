/*Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.*/

public class Studente{
    private String name;
    private String surname;
    private int id;

    public Studente(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    @Override
    public String toString() {
        return name + " " + surname + " " + id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }

}
