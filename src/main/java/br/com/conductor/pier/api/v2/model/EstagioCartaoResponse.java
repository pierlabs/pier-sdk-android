package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso Est\u00E1gio Cart\u00E3o
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso Est\u00E1gio Cart\u00E3o")
public class EstagioCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * Id do est\u00E1gio cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Id do est\u00E1gio cart\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do est\u00E1gio cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Nome do est\u00E1gio cart\u00E3o")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstagioCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
