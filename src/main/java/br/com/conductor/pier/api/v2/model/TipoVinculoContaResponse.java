package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de resposta do recurso de tipos de v\u00EDnculos
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de tipos de v\u00EDnculos")
public class TipoVinculoContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * C\u00F3digo identificador do tipo de v\u00EDnculo (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo de v\u00EDnculo (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de v\u00EDnculo
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de v\u00EDnculo")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoVinculoContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
