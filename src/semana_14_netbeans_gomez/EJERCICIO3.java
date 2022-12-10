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
 clase  pública ejercicio_03 {
    
    public  static  void  main ( String [] args ) {
        int  a [] = new  int [ IngresoCantidad ()];
        ingresoDatos ( a );
        MostrarArrayInicial ( a );
        ordenInsercion ( a );
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
    
    public  static  void  ordInsercion ( int [] a ){
	int  i , j ;
	intaux  ; _
	for ( i = 1 ; i < a . longitud ; i ++){
            /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
            posicion correcta del elemento destino*/
            j = yo ;
            aux = un [ yo ];	
            // se localiza el punto de inserción explorando hacia abajo
            while ( j > 0 && aux < a [ j - 1 ]){
	 	// desplazar elementos hacia arriba para hacer espacio
	 	un [ j ] = un [ j - 1 ];
	 	j --;
            }
            un [ j ] = auxiliar ;
	 }
    }
}