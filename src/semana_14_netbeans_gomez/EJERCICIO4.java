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
 clase  pública EJERCICIO4 {
    
    public  static  void  main ( String [] args ) {
        int  a [] = new  int [ IngresoCantidad ()];
        ingresoDatos ( a );
        MostrarArrayInicial ( a );
        ordenacionShell ( a );
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
    
    public  static  void  ordenacionShell ( int  a []){
	int  intervalo , i , j , k ;
	entero  n = un . longitud ;
	intervalo = n / 2 ;
	while ( intervalo > 0 ){
            for ( i = intervalo ; i < n ; i ++){
                j = i - intervalo ;
	 	mientras ( j >= 0 ){
                    k = j + intervalo ;
                    si ( un [ j ] <= un [ k ]){
                        j = - 1 ; // por elementos ordenados
                    } más {
	 	 	intercambiar ( a , j , j + 1 );
	 	 	j -= intervalo ;
                    }
	 	}
            }
            intervalo = intervalo / 2 ;
	}
    }
    
    public  static  void  intercambiar ( int [] a , int  i , int  j ){
	intaux  = a [ i ] ;
	un [ yo ] = un [ j ];
	a [ j ]= auxiliar ;
    }
}