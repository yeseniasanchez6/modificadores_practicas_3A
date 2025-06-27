import paquete.Clase1; //Usar clases que esten en paquete

public class TestingModificador {
    public static void main(String[] args){
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        Clase1 objeto1 = new Clase1();

        System.out.println();
        System.out.println(unPapa.toString());
        
        unPapa.campo1 = 28; //Modificar el campo publico
        unPapa.setCampo2(-12); //Modificar el campo privado

        System.out.println(unPapa.toString());

        //Comportamiento de campo privado y publico en el hijo
        unHijo.campo1 = 32; //Campo publico heredado 
        unHijo.setCampo2(-45);//Campo privado heredado
        unHijo.setCampo3(12);//Campo privado propio

        System.out.println(unHijo.toString());

        //Comportamiento de campo de una clase en un paque
        objeto1.x = 56; //Campo publico
        objeto1.setY(42); //Campoprivado

       //No se puede acceder porque no esta en el mismo paquete y es tipo protected
       //objeto1.z = 98;
       System.out.println(objeto1.toString());
}
}
