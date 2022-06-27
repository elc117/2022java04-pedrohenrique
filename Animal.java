/*
Class para Animais
Ex. de Classes Filhas: gato, cachorro, girafa, crocodilo 
*/
public class Animal{
    private String classe; //classe do Animal, por Ex: mamifero, ave, anfibio, etc.

    public Animal(){
        this("Sem classe");
    }
    public Animal(String classe){
        this.classe = classe;
    }


    public void SetClasse(String classe){
        this.classe = classe;
    }
    public String GetClasse(){
        return this.classe;
    }
}
