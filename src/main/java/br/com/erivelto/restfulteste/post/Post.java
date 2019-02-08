package br.com.erivelto.restfulteste.post;

import br.com.erivelto.restfulteste.Tag.Tag;
import br.com.erivelto.restfulteste.imagem.Imagem;
import br.com.erivelto.restfulteste.usuario.Usuario;
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
            {@JoinColumn(name="pessoaId")}, inverseJoinColumns=
            {@JoinColumn(name="postId")})
    private List<Usuario> autorList;//

    @Column(name = "data_publicacao")
    private Date dataPublicacao;

    @ManyToMany
    @JoinTable(name = "tag_lists", joinColumns =
            {@JoinColumn(name = "tagId")}, inverseJoinColumns =
            {@JoinColumn(name = "postId")})
    private List<Tag> tagList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Imagem> imagem;
}
