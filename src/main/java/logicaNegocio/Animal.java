package logicaNegocio;

public abstract class Animal {

    private TipoHabitat habitat;

    public TipoHabitat getHabitat() {
        TipoHabitat habitat = null;
        return habitat;
    }

    public void setHabitat(TipoHabitat habitat) {
        this.habitat = habitat;
    }

    public abstract String emitirSonido();

    public abstract String obtenerDieta();

}
