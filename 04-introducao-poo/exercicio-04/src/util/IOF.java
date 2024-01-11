package util;

public class IOF {

    public static final double TAXA_IOF = 6.0;
    
    public static double aplicaIOF(double valorBruto) {
        return valorBruto + ((valorBruto / 100) * TAXA_IOF);
    }

}
