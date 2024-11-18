package logicaNegocio;

public class Delfin extends Animal {
    
    private TipoHabitat habitat = TipoHabitat.ACUATICO;

    public String emitirSonido() {
        return "Chillido";
    }

    public String obtenerDieta() {
        return "Pescado";
    }

    public String obtenerHabitat() {
        return "ACUATICO";
    }
    
}

