/*
Class para Animais
Ex. de Classes Filhas: gato, cachorro, girafa, crocodilo 
*/
public class Animal{
    private String name; //nome do Animal, por Ex: gato chamado Januário
    private String classe; //classe do Animal, por Ex: mamifero, ave, anfibio, etc.

    public Animal(){
        this("Sem nome","Sem classe");
    }
    public Animal(String name, String classe){
        this.name = name;
        this.classe = classe;
    }

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return this.name;
    }

    public void SetClasse(String classe){
        this.classe = classe;
    }
    public String GetClasse(){
        return this.classe;
    }
}