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
 clase  pública EJERCICIO5 {
    
    public  static  void  main ( String [] args ) {
        int  a [] = new  int [ IngresoCantidad ()];
        ingresoDatos ( a );  
        MostrarArrayInicial ( a );
        clasificación rápida ( a );
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
    
     clasificación rápida de vacío estático  público ( int a []){  
	clasificación rápida ( a , 0 , a . length - 1 );
    }
    
     Clasificación rápida de vacío estático  público ( int a [], int primero , int ultimo ) {    
	int  i , j , central ;
	 pivote doble ;
	central = ( primero + ultimo )/ 2 ;
	pivote = un [ central ];
	yo = primero ;
	j = último ;
	hacer {
            while ( a [ i ] < pivote ) i ++;
            while ( a [ j ] > pivote ) j --;
            si ( yo <= j ){
	 	intercambiar ( a , i , j );
	 	yo ++;
	 	j --;
            }
	} mientras ( yo <= j );
	si ( primero < j ){
            clasificación rápida ( a , primero , j ); // mismo proceso con sublista izqda
        }
        
        si ( yo < ultimo ){
            clasificación rápida ( a , i , ultimo ); // mismo proceso con sublista drcha
        }
    }
    
    public  static  void  intercambiar ( int [] a , int  i , int  j ){
	intaux  = a [ i ] ;
	un [ yo ] = un [ j ];
	a [ j ]= auxiliar ;
    }
}