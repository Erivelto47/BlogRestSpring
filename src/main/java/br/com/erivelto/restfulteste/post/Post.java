package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.Tag.Tag;
import br.com.erivelto.restfulteste.autor.Autor;
import br.com.erivelto.restfulteste.imagem.Imagem;
import lombok.Data;

import javax.persistence.*;
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

    @ManyToMany
    @JoinTable(name="post_autor", joinColumns=
            {@JoinColumn(name="autorId")}, inverseJoinColumns=
            {@JoinColumn(name="postId")})
    private List<Autor> autor;
    private Date dataPublicacao;

    @ManyToMany
    @JoinTable(name = "tag_lists", joinColumns =
            {@JoinColumn(name = "tagId")}, inverseJoinColumns =
            {@JoinColumn(name = "postId")})
    private List<Tag> tagList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Imagem> imagem;



}
