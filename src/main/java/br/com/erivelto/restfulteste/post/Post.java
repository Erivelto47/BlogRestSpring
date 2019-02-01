package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.Tag.Tag;
import br.com.erivelto.restfulteste.autor.Autor;
import br.com.erivelto.restfulteste.imagem.Imagem;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * Create by erivelto on 01/02/19
 */

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long postId;

    private String titulo;
    private String subtitulo;
    private List<Autor> autor;
    private Date dataPublicacao;
    private List<Tag> tagList;
    private List<Imagem> imagem;



}
