package heranca;

public enum CambioEnum {
    AUTOMATICO("Automático"),
    MANUAL("Manual");
    
    private String tipoCambio;
    
    private CambioEnum(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
    
    public  String getTipoCambio() {
        return this.tipoCambio;
    }
}
