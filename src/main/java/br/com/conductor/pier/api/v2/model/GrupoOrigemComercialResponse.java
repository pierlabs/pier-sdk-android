package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do grupo de origem comercial
 **/
@ApiModel(description = "Objeto de resposta do grupo de origem comercial")
public class GrupoOrigemComercialResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do grupo de origem comercial.
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do grupo de origem comercial.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do grupo da origem comercial
   **/
  @ApiModelProperty(value = "Nome do grupo da origem comercial")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoOrigemComercialResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
