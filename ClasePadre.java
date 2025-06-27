public class ClasePadre{
    //Mienbro de la clase (propiedades, atributos, campos)
    public int campo1; //Aceptar solo valores positivos
    private int campo2;  //campo2 aceptar solo valores negativos
    //Agregar set y get para que puedas usarla, sirve para la integridad y que nadie pueda usarla
                       
    public void setDatos(){
        this.campo1 = 12;
        this.campo2 = this.campo1+1;  
    }
    
    public int getCampo2() {
        return campo2;
    }

    public void setCampo2(int campo2) {
        if(campo2 < 0)
        this.campo2 = campo2;
        else
        this.campo2 = 0;
    }
        @Override
    public String toString() {
        return "ClasePadre [campo1=" + campo1 + ", campo2=" + campo2 + "]";
    }
}