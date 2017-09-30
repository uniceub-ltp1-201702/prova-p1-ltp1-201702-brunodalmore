//Nome: Bruno Henrique Amorim
//RA: 21709778
//LTP1
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bd = new BDSimulado();
		System.out.println(bd.getInfoCliente("Maria do Socorro"));
		System.out.println(bd.ligacoesPorCliente("Otaviano Neves"));
		System.out.println(bd.getligacoesPorUF("Brasilia"));
		
		
	}

}
