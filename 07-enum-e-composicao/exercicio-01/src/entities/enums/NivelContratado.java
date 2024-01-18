package entities.enums;

public enum NivelContratado {
    
    JUNIOR("junior"),
    PLENO("pleno"),
    SENIOR("senior");
    
    private final String nivel;

    private NivelContratado(String nivel) {
        this.nivel = nivel.toUpperCase();
    }

    public String getNivel() {
        return this.nivel;
    }

}
