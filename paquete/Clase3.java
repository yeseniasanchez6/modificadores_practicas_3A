package paquete;

public class Clase3 {
    Clase1 objeto1 = new Clase1();

    public void serDataClase1(){
        objeto1.x = 10; //Usando la variable publica de clase 1 sin tener la herencia 
        //Solo si la variable x es estatica en clase1
        //Clase1.x = 9;
        objeto1.w = 29; //Aunque no hereda, puede usar w
        objeto1.restW();
    }
    
}
