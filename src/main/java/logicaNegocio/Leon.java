package logicaNegocio;

public class Leon extends Animal {

    private TipoHabitat habitat = TipoHabitat.TERRESTRE;

    public String emitirSonido() {
        return "Rugido";
    }

    public String obtenerDieta() {
        return "Carnivoro";
    }

    public String obtenerHabitat() {
        return "TERRESTRE";
    }
    
    
    
}
