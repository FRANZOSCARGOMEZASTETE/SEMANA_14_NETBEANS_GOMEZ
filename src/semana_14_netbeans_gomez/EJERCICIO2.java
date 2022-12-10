/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana_14_netbeans_gomez;

importar  Java . útil _ escáner ;

/**
*
* @autor Franz
*/
 clase  pública EJERCICIO2 {
    public  static  void  main ( String [] args ) {
        int  a [] = new  int [ IngresoCantidad ()];
        ingresoDatos ( a );
        MostrarArrayInicial ( a );
        ordenSeleccion ( a );
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
    
    public  static  void  ordSeleccion ( int  a []){
	int  indiceMenor , i , j , n ;
	n = un . longitud ;	
	para ( yo = 0 ; yo < n - 1 ; yo ++){
            // comienzo de la exploración en el índice i
            índiceMenor = i ;
            // j explora la sublista a[i+1]..a[n-1]
            para ( j = yo + 1 ; j < norte ; j ++){
	 	if ( a [ j ] < a [ indiceMenor ]){
                    índiceMenor = j ;
                    // coloca el elemento mas pequeño en a[i]
                    if ( i != índiceMenor ){
	 	 	intercambiar ( a , i , indiceMenor );
                    }
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