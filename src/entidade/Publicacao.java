package entidade;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {
private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Publicacao() {
	}

	public Publicacao(Date moment, String titulo, String conteudo, Integer likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return titulo;
	}

	public void setTitle(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return conteudo;
	}

	public void setContent(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComments() {
		return comentarios;
	}

	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}

	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentario:\n");
		for (Comentario c : comentarios) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
