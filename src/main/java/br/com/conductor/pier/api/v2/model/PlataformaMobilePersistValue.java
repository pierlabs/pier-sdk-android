package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plataforma_mobile_persist_description}}}
 **/
@ApiModel(description = "{{{plataforma_mobile_persist_description}}}")
public class PlataformaMobilePersistValue  {
  
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * {{{plataforma_mobile_persist_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{plataforma_mobile_persist_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlataformaMobilePersistValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
