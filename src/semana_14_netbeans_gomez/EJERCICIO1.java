/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_14_netbeans_gomez;

importar  Java . útil _ escáner ;
/**
 *
 * @author Franz
 */
public class EJERCICIO1 {

/**
*
* @autor Franz
*/
 clase  pública EJERCICIO1 {
    
    public  static  void  main ( String [] args ) {
        int  a [] = new  int [ IngresoCantidad ()];
        ingresoDatos ( a );
        MostrarArrayInicial ( a );
        ordIntercambio ( a );
        MostrarArrayFinal ( a );
    }
    
    public  static  int  IngresoCantidad (){
        Escáner  sc = nuevo  Escáner ( System . in );
        sistema _ fuera _ print ( "Ingrese la CANTIDAD:" );
        int  cantidad = sc . siguienteInt ();
        devolver  cantidad ;
    }
    
     ingresoDatos public static  void  ( int a []){ 
        para ( int  i = 0 ; i < a . longitud ; i ++){
            Escáner  sc = nuevo  Escáner ( System . in );
            sistema _ fuera _ print ( "Ingrese el dato " +( i + 1 )+ " : " );
            un [ yo ] = sc . siguienteInt ();
        }
    }
    
    public  static  void  MostrarArrayInicial ( int  a []){
        sistema _ fuera _ println ( "Array INICIAL" );
        para ( int  i = 0 ; i < a . longitud ; i ++){
            sistema _ fuera _ println ( "dato [" + i + "] es : " + a [ i ]);
        }
    }
    
    public  static  void  MostrarArrayFinal ( int  a []){
        sistema _ fuera _ println ( "Array FINAL" );
        para ( int  i = 0 ; i < a . longitud ; i ++){
            sistema _ fuera _ println ( "dato [" + i + "] es : " + a [ i ]);
        }
    }
    
    public  static  void  ordIntercambio ( int  a []){
	int  i , j ;
	for ( i = 0 ; i < a . longitud - 1 ; i ++){
            // coloca mínimo de a[i+1]...a[n-1] en a[i]
            para ( j = i + 1 ; j < a . longitud ; j ++){
	 	si ( un [ yo ] > un [ j ]){
                    intercambiar ( a , i , j );
	 	}
            }
        }
    }
    
    public  static  void  intercambiar ( int [] a , int  i , int  j ){
	intaux  = a [ i ] ;
	un [ yo ] = un [ j ];
	a [ j ]= auxiliar ;
    }
}