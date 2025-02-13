package equipamentos.estabelecimento;
import equipamentos.impressora.*;
import equipamentos.multifuncional.*;
import equipamentos.copiadora.*;
import equipamentos.digitalizadora.*;


public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora=new Deskjet();
		Copiadora copiadora = new Xerox();
		
		Digitalizadora digitalizadora = new EquipamentoMultifuncional();
		
		impressora.imprimir();
		copiadora.Copiar();
		digitalizadora.Digitalizar();
	}
}
