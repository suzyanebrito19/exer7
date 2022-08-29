package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidade.Comentario;
import entidade.Publicacao;
public class Programa {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Faça uma boa viagem!");
		Comentario c2 = new Comentario("Uau que incrivel!");
		Publicacao p1 = new Publicacao(
				sdf.parse("21/06/2018 13:05:44"), 
				"Viajar para a Nova Zelândia", 
				"Eu vou visitar este país maravilhoso!", 
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a força esteja com você");
		Publicacao p2 = new Publicacao(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite, galera", 
				"Vejo você amanhã", 
				5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
