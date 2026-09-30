
package reservas_anfiteatro;

import java.util.Scanner;

public class Reservas_Anfiteatro {
   
    public static void main(String[] args) {

        // . Constantes Numericas .
        // (P)rimera y (U) (f)ila (d)isponible.
        byte cnPfd = 1, cnUfd = 10 ;
        byte cnPad = 1, cnUad = 10 ;
        // (P)rimera y (U) (f)ila en la (m)atriz .
        byte cnPfm = (byte) (cnPfd - 1);
        //byte cnUfm = (byte) (cnUfd - 1) ;
        byte cnPam = (byte) (cnPad - 1) ;
        //byte cnUam = (byte) (cnUad - 1) ;
        
        String acAsientos[][] = new String [ cnUfd ][ cnUfd ] ;
        String ccAlib = "L", ccAres = "X" ;
        byte  nFila, nAsiento, nOpcion = 0 ;
        byte  nFilaM = 0, nAsientoM = 0 ;

        byte cnRESERVAR = 1, cnMOSTRAR = 2, cnSALIR = 3 ;
        

        
        
        Scanner teclado = new Scanner(System.in) ;
        
        
        // Inicializa todos los asientos como libres .
        //
        for ( nFilaM = cnPfm ; nFilaM < cnUfd ; nFilaM++ )

          for ( nAsientoM = cnPam ; nAsientoM < cnUad ; nAsientoM++ )

            acAsientos[ nFilaM ][ nAsientoM ] = ccAlib ;

            
        do {
            
            System.out.println( "" ) ;
            System.out.println( "1. Reservar asiento" ) ;
            System.out.println( "2. Mostrar mapa de asientos" ) ;
            System.out.println( "3. Salir" ) ;
            System.out.println( "" ) ;
            
            System.out.print( " ¿ Opcion ? : " ) ;
            nOpcion = teclado.nextByte() ;
                       
            
            //  R E S E R V A
            //
            if ( nOpcion == cnRESERVAR )
            {

                // F I L A
                //  
                do {


                    System.out.println( "" ) ;
                    System.out.print( "¿ Numero de Fila ? : " ) ;

                    nFila = teclado.nextByte() ;
                               
                  } while ( nFila < cnPfd || nFila > cnUfd ) ;

                  // A S I E N T O
                  //  
                  do {

                    System.out.println( "" ) ;
                    System.out.print( "¿ Numero de Asiento ? : " ) ;

                    nAsiento = teclado.nextByte() ;

                  } while ( nAsiento < cnPad || nAsiento > cnUad ) ;


                  nFilaM = (byte) (nFila - 1) ;
                  nAsientoM = (byte) (nAsiento - 1) ;

                  //  Si esta libre, reserva el asiento .
                  //

                  if ( acAsientos[ nFilaM ][ nAsientoM ] == ccAlib )
                  {

                    acAsientos[ nFilaM ][ nAsientoM ] = ccAres ;
                    System.out.println("El asiento indicado ha sido Reservado") ;
                  }

                  else
                  {
                    System.out.println("" ) ;
                    System.out.println("Ese asiento esta OCUPADO. Elija otro") ;
                  }

            }
            
            else if ( nOpcion == cnMOSTRAR )
            {
              
              System.out.println("      Asiento") ;
              System.out.println("      1 2 3 4 5 6 7 8 9 10") ;
              System.out.println("Fila " ) ;
                
              for ( nFilaM = cnPfm, nFila = cnPfd ; nFilaM < cnUfd ; nFilaM++, nFila++ )
              {
                System.out.format( "   %2d", nFila  ) ;
              
                for ( nAsientoM = cnPam ; nAsientoM < cnUad ; nAsientoM++ )
        
                  System.out.print( " " + acAsientos[ nFilaM ][ nAsientoM ] ) ;
                
                System.out.println( "" ) ;
                
              }
              
              System.out.println( "" ) ;
              System.out.println( "" ) ;
              
            }
               
        } while ( nOpcion != cnSALIR ) ;
    }
}

