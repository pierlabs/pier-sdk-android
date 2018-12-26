package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response do Tipo Servi\u00E7o
 **/
@ApiModel(description = "Objeto Response do Tipo Servi\u00E7o")
public class TipoServicoResponse  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("id")
  private Long id = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identificador do Tipo Servi\u00E7o
   **/
  @ApiModelProperty(value = "Identificador do Tipo Servi\u00E7o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoServicoResponse {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
