
import paquete.Clase1;

public class ClaseHijo extends ClasePadre{
    private int campo3;

    public int getCampo3() {
        return campo3;
    }

    public void setCampo3(int campo3) {
        this.campo3 = campo3;
    }

    //modificar los campos de la ClasePadre
    public void setDataPadre(){
        this.campo1 = -56; //Variable publica heredada
        //Variable privada heredada 
        this.setCampo2(23); //Formas de hacer iguales pero en otro contexto, por que estoy 
                                 //heredando, es publico super.setCampo2(23);setCampo2(48);
    }

    public void useClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15; //Publico
        objeto1.setY(14); //privado
       // objeto1.z = 9; protegido: dentro del mismo paquete
        //objeto1.w = 49; default: dentro del mispo maquete
        //objeto1.restW(); defaul: pero en otro paquete
    }

    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [campo3=" + this.campo3 + "]";
    }
    
}
