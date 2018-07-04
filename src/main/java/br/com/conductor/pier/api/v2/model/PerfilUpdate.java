package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{perfil_update_object_description}}}
 **/
@ApiModel(description = "{{{perfil_update_object_description}}}")
public class PerfilUpdate  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("permissoes")
  private List<ReferenciaIdPersist> permissoes = null;

  
  /**
   * {{{perfil_update_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{perfil_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{perfil_update_permissoes_value}}}
   **/
  @ApiModelProperty(value = "{{{perfil_update_permissoes_value}}}")
  public List<ReferenciaIdPersist> getPermissoes() {
    return permissoes;
  }
  public void setPermissoes(List<ReferenciaIdPersist> permissoes) {
    this.permissoes = permissoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  permissoes: ").append(permissoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


