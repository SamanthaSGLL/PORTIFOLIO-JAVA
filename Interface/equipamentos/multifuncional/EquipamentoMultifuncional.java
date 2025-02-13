package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

	@Override
	public void Copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCINAL");
	}

	@Override
	public void Digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCINAL");		
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCINAL");
	}
}
