package es.studium.practicaAD;



public class Main {
	
	public static void main(String[] args) {
		
		//Primero crearemos algunos productos
		
		ArticuloAComprar a1=new ArticuloAComprar("Tomates",1,"Kg");
		ArticuloAComprar a2=new ArticuloAComprar("Pimientos",2,"Kg");
		ArticuloAComprar a3=new ArticuloAComprar("Agua",2,"L");
		ArticuloAComprar a4=new ArticuloAComprar("Galletas",4,"Paquetes");
		ArticuloAComprar a5=new ArticuloAComprar("Cebolla",7,"Kg");
		ArticuloAComprar a6=new ArticuloAComprar("Aguacate",6,"Kg");
		
		//Crearemos las listas de la compra para cada comercio
		
		ListaDeLaCompra l1=new ListaDeLaCompra("Aldi");
		
		ListaDeLaCompra l2=new ListaDeLaCompra();
		l2.setNombreLista("Mercadona");
		
		ListaDeLaCompra l3=new ListaDeLaCompra();
		l3.setNombreLista("Jamón");
		
		//Agregamos los productos
		
		l1.agregarProductoAComprar(a1);
		l1.agregarProductoAComprar(a2);
		
		l2.agregarProductoAComprar(a3);
		l2.agregarProductoAComprar(a4);
		
		l3.agregarProductoAComprar(a5);
		l3.agregarProductoAComprar(a6);
		
		//Mostramos las listas
		
		System.out.println("Listas de la compra:"+"\n");
		
		System.out.println("La lista del supermercado "+l1.getNombreLista()+" tiene:");
		for(ArticuloAComprar articulo:l1.getArticulos()) {
			
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nLa lista del supermercado "+l2.getNombreLista()+" tiene:");
		for(ArticuloAComprar articulo:l2.getArticulos()) {
			
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nLa lista del supermercado "+l3.getNombreLista()+" tiene:");
		for(ArticuloAComprar articulo:l3.getArticulos()) {
			
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());			
		}
		
		//Creamos los ficheros .dat
		
		System.out.println("Guardando Listas");
		
		
		l1.guardarListaDeCompra();
		l2.guardarListaDeCompra();
		l3.guardarListaDeCompra();
		
		//Borramos archivos y enseñamos las listas
		
		System.out.println("\nEditamos la lista del Aldi");
		ListaDeLaCompra salidaLista=ListaDeLaCompra.salidaListaComprar("Aldi");
		for(ArticuloAComprar articulo:salidaLista.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nEliminaremos los tomates de la lista:");
		salidaLista.eliminarArticulo("Tomates");
		
		System.out.println("\nProducto eliminado");
		for(ArticuloAComprar articulo:salidaLista.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nEditamos la lista del mercadona");
		ListaDeLaCompra salidaLista2=ListaDeLaCompra.salidaListaComprar("Mercadona");
		for(ArticuloAComprar articulo:salidaLista2.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nEliminaremos el agua de la lista:");
		salidaLista2.eliminarArticulo("Agua");
		
		System.out.println("\nProducto eliminado");
		for(ArticuloAComprar articulo:salidaLista2.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nEditamos la lista de el Jamón");
		ListaDeLaCompra salidaLista3=ListaDeLaCompra.salidaListaComprar("Jamón");
		for(ArticuloAComprar articulo:salidaLista3.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
		
		System.out.println("\nEliminaremos un el aguacate de la lista:");
		salidaLista3.eliminarArticulo("Aguacate");
		
		System.out.println("\nProducto eliminado");
		for(ArticuloAComprar articulo:salidaLista3.getArticulos()) {
			System.out.println(articulo.getDescripcion()+" , "+articulo.getCantidad()+articulo.getUnidad());
		}
	}
}
