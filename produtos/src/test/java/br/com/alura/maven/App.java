package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Produto produto = new Produto("Bala Juquinha sabor Tangereina", 0.15);
        
    	System.out.println( "A bala que o Guilherme gosta é:  " + produto.getNome() + "e custa R$ " + produto.getPreco());
    }
}
