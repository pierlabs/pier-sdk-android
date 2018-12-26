package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do recurso de tipos de origens comerciais
 **/
@ApiModel(description = "Objeto de resposta do recurso de tipos de origens comerciais")
public class TipoOrigemComercialResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo de Origem Comercial
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo de Origem Comercial")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do tipo de origem comercial
   **/
  @ApiModelProperty(value = "Nome do tipo de origem comercial")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOrigemComercialResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
