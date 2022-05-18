
package proj_pedido;

/**
 *
 * @author jenny
 */
public class Item {
    private int codigo; 
    private int quantidade;
    private double preco;

public Item(int codigo, int quantidade, double preco) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
public double calcularCustoItem()
{
    return quantidade*preco;
    
}       
 
public void Imprime()
        
{
    System.out.println("´Código Item: " + codigo);
    System.out.println("Quantidade:" + quantidade);
    System.out.println("Preço:" + preco);
}
    
}
