package REFINADO.AULA102ANNOTATIONS;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Instituição:      Universidade XTI
 * Projeto:          Sistema de Avaliações
 * Data de Criação:  22/01/2026
 * Criador:          João Marcos
 * Revisão:          2
 */

@Target(ElementType.TYPE)

@Documented

public @interface Cabecalho {
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;
}
