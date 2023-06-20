import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        Scanner sc = new Scanner(System.in);
        Tienda ti = new Tienda();
        int op =0;

        v1.setVisible(true);

        do {
            System.out.println("opcion 1");
            System.out.println("opcion 2");
            System.out.println("opcion 3");
            System.out.println("opcion 4");
            System.out.println("opcion 5");
            op = Integer.parseInt(sc.next());

            switch (op){
                case 1:
                    System.out.println("Nombre: " +ti.darProducto1().darNombre()+" Tipo: "+ ti.darProducto1().darTipo()+" cantida: "+ ti.darProducto1().darCantidadBodega()+" unidades vendidas: "+ti.darProducto1().darCantidadUnidadesVendidas()+" precio: "+ ti.darProducto1().darValorUnitario());
                    System.out.println("Nombre: " +ti.darProducto2().darNombre()+" Tipo: "+ ti.darProducto2().darTipo()+" cantida: "+ ti.darProducto2().darCantidadBodega()+" unidades vendidas: "+ti.darProducto2().darCantidadUnidadesVendidas()+" precio: "+ ti.darProducto2().darValorUnitario());
                    System.out.println("Nombre: " +ti.darProducto3().darNombre()+" Tipo: "+ ti.darProducto3().darTipo()+" cantida: "+ ti.darProducto3().darCantidadBodega()+" unidades vendidas: "+ti.darProducto3().darCantidadUnidadesVendidas()+" precio: "+ ti.darProducto3().darValorUnitario());
                    System.out.println("Nombre: " +ti.darProducto4().darNombre()+" Tipo: "+ ti.darProducto4().darTipo()+" cantida: "+ ti.darProducto4().darCantidadBodega()+" unidades vendidas: "+ti.darProducto4().darCantidadUnidadesVendidas()+" precio: "+ ti.darProducto4().darValorUnitario());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a vender: ");
                    String pNombre = sc.next();
                    System.out.println("Ingrese la cantidad: ");
                    int pCantidad = Integer.parseInt(sc.next());
                    System.out.println(""+ti.venderProducto(pNombre, pCantidad));
                    break;
                case 3:
                    System.out.println("Ingrse el nombre del producto a abastecer: ");
                    pNombre = sc.next();
                    System.out.println("Ingrese la cantidad: ");
                    pCantidad = Integer.parseInt(sc.next());
                    //ti.abastecerProducto(pNombre, pCantidad);
                    System.out.println("Producto ingresado"+ti.abastecerProducto(pNombre, pCantidad));
                    break;
                case 4:
                    System.out.println("Ingrese el nombre actual: ");
                    pNombre=sc.next();
                    System.out.println("INgrese el nuevo nombre");
                    String pNombreNuevo= sc.next();
                    System.out.println("Ingrese el tipo: ");
                    String pTipo = sc.next();
                    System.out.println("Ingrese el valor unitario: ");
                    double pValorUnitario = Double.parseDouble(sc.next());
                    System.out.println("Ingrese la cantidad en bodega");
                    int pCantidadBodega = Integer.parseInt(sc.next());
                    System.out.println("Ingrese cantidad minima: ");
                    int pCantidadMinima = Integer.parseInt(sc.next());
                    boolean resultado=ti.cambiarProducto(pNombre, pNombreNuevo, Producto.Tipo.valueOf(pTipo), pValorUnitario, pCantidadBodega,pCantidadMinima);
                    System.out.println("Se cambio el producto"+resultado);
                case 5:
                    int menu2=0;
                    do {
                        System.out.println("1 El producto mas vendido: ");
                        System.out.println("2 Producto menos vendido: ");
                        menu2 = Integer.parseInt(sc.next());
                        switch (menu2){
                            case 1 :
                                System.out.println("El producto mas vendido es: "+ti.darProductoMasVendido().darNombre());
                                break;
                            case 2:
                                System.out.println("menos vendido: "+ti.darProductoMenosVendido().darNombre());
                                break;
                            case 3:
                                System.out.println("cantida" +ti.darDineroEnCaja());
                                break;
                            case 4:
                                System.out.println("cantidad promedio" +ti.darPromedioVentas());
                                break;
                        }



                    }while(menu2!=5);




            }


        }while (op != 6);

    }
}