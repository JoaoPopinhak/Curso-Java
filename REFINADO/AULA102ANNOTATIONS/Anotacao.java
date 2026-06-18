package REFINADO.AULA102ANNOTATIONS;

import java.io.Serializable;

/**
 * Instituição:      Universidade XTI
 * Projeto:          Sistema de Avaliações
 * Data de Criação:  22/01/2026
 * Criador:          João Marcos
 * Revisão:          2
 */

@Cabecalho (
		instituicao = "Universidade XTI",
		projeto     = "Sistema de Avaliações",
		dataCriacao = "21/03/2001",
		criador     = "João Marcos Rodrigues",
		revisao     = 2		
)



@ErrosCorrigidos("0001"+"0002")

@SuppressWarnings("serial")
public class Anotacao implements Serializable{

	@SuppressWarnings("unused")
	private int x;
	
	@Deprecated
	public void anotar(){}

	
	@Override
	public String toString(){
		return null;
	}
	
}