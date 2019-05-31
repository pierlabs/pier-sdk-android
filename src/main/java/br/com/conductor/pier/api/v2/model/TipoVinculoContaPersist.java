package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a requisi\u00E7\u00E3o do recurso de cadastro de um tipo de v\u00EDnculo
 **/
@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de cadastro de um tipo de v\u00EDnculo")
public class TipoVinculoContaPersist  {
  
  @SerializedName("descricao")
  private String descricao = null;

  
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
    sb.append("class TipoVinculoContaPersist {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
