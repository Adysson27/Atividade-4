package atv4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	        Gerente gerente = new Gerente(45,"Tobey Maguire","48294344060","Gerente Regional",8542.00, 1,"Norte-Nordeste",500);
	        Gerente gerente2 = new Gerente(49,"Dwayne Johnson","06302064066","Gerente Regional",5896.00, 2,"Sul-Sudeste",500);
	        Vendedor vendedor = new Vendedor(53,"Jason Statham","01413021000","Vendedor Interno", 2500.00, gerente,0,0.10,150);
	        Vendedor vendedor2 = new Vendedor(56,"Robert Downey Jr.","03526992053","Vendedor Externo", 2000.50, gerente2,0,0.05,100);

	        List<Vendas> vendas = new ArrayList<>();
	        List<Vendas> vendas02 = new ArrayList<>();
	        List<Vendedor> vendedores = new ArrayList<>();

	        
	        vendedores.add(vendedor);
	        vendedores.add(vendedor2);

	        
	        gerente.setVendedores(vendedores);
	        gerente2.setVendedores(vendedores);

	        
	        Vendas vendas1 = new Vendas(500);
	        Vendas vendas2 = new Vendas(650);
	        Vendas vendas3 = new Vendas(725);
	        Vendas vendas4 = new Vendas(400);
	        Vendas vendas5 = new Vendas(300);
	        Vendas vendas6 = new Vendas(1000);
	        Vendas vendas7 = new Vendas(800);
	        Vendas vendas8 = new Vendas(725);
	        Vendas vendas9 = new Vendas(900);
	        Vendas vendas10 = new Vendas(999);

	       
	        vendas.add(vendas1);
	        vendas.add(vendas2);
	        vendas.add(vendas3);
	        vendas.add(vendas4);
	        vendas.add(vendas5);

	        
	        vendas02.add(vendas6);
	        vendas02.add(vendas7);
	        vendas02.add(vendas8);
	        vendas02.add(vendas9);
	        vendas02.add(vendas10);

	        vendedor.setVendas(vendas);
	        vendedor2.setVendas(vendas02);

	        vendedor.getTotalVendas();
	        vendedor.getTotalComissao();

	        vendedor2.getTotalVendas();
	        vendedor2.getTotalComissao();

	        gerente.getComissaoTotalGerente();
	        gerente2.getComissaoTotalGerente();
	        
	        System.out.println();
	        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " Salário vendedor 1: " + vendedor.getSalario());
	        System.out.println();
	        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " Salário vendedor 2: "+ vendedor2.getSalario());
	        System.out.println();
	        System.out.print("Gerente 1: ");
	        System.out.println(gerente.getNome()+" - Salário: "+gerente.getSalario());
	        System.out.println();
	        System.out.print("Gerente 2: ");
	        System.out.println(gerente2.getNome()+" - Salário: "+gerente2.getSalario());

	    }
		

	}
