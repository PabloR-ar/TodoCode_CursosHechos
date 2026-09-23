
/**
 *
 * @author PabloR-ar
 */
public class Main {

    public static void main(String[] args) {
        
        //
        // P o l i z a  d e  S e g u r o
        //
        String empAseg = "SegurCoop" ;
        String empSeccion = "Automotores" ;
        int polNum = 4385613 ;
        int polEndosoNum = 5321123 ;
        String polVigenciaD_DMA = "12-09-2026" ;
        int polVigenciaD_H = 1200 ;
        String polVigenciaH_DMA = "12-12-2026" ;
        int polVigenciaH_H = 1200 ;
        String asegApNom = "Redondo, Pablo Javier" ;
        int asegCP = 4200 ;
        String asegProv = "SdE" ;
        String asegDNI = "20217022011" ;  // demasiado largo como numero.
        char polMoneda = '$' ;
        double polPrimaP = 11502.27 ;
        boolean polActiva = true ;  // dato inventado .
        
        
        
        System.out.println("+ Empresa" ) ; 
        System.out.println("   Aseguradora : " + empAseg );
        System.out.println("   Seccion     : " + empSeccion ) ;
        
        System.out.println(" ");
        
        System.out.println("+ Poliza") ;
        System.out.println("   Numero de Poliza : " + polNum ) ;
        System.out.println("   Endoso Numero : " + polEndosoNum ) ;
        System.out.println("   Vigencia" ) ;
        System.out.println("     desde dia/mes/año :" + polVigenciaD_DMA ) ;
        System.out.println("           hora        :" + polVigenciaD_H ) ;
        System.out.println("     hasta dia/mes/año :" +  polVigenciaH_DMA ) ;
        System.out.println("           hora        :" + polVigenciaH_H ) ;
        
        System.out.println(" ");
        
        System.out.println("+ Asegurado" ) ;
        System.out.println("   Apellidos y Nombres :" + asegApNom ) ;
        System.out.println("   Codigo Postal       : " + asegCP ) ;
        System.out.println("   Provincia           : " + asegProv ) ;
        System.out.println("   D.N.I.              : " + asegDNI ) ;
        
        System.out.println(" ");
        
        System.out.println("+ Montos" ) ;
        System.out.println("   Moneda     : " + polMoneda ) ;
        System.out.println("   Prima Pura : " + polPrimaP ) ;
        
        System.out.println(" ");
        
        System.out.println("+ Estado" ) ;
        System.out.println("   Activa : " + polActiva ) ;  // dato inventado .
        
        System.out.println(" ");
    }
    
}
