package br.com.erivelto.restfulteste.usuario;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by erivelto on 08/02/19
 */
public enum TipoUsuario {

    ADMINISTRADOR("ADM"),
    LEITOR("LTR"),
    AUTOR("ATR");

    @Getter
    private String tipoUsuario;

    private static final Map<String, TipoUsuario> usuarioPorTipo = new HashMap<>();

    static {
        for (TipoUsuario tipoUsuario: TipoUsuario.values()){
            usuarioPorTipo.put(tipoUsuario.getTipoUsuario(), tipoUsuario);
        }
    }

    TipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public static TipoUsuario getUsuarioPorTipo(String tipoUsuario){
        return usuarioPorTipo.get(tipoUsuario);
    }

}
