package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o de atualiza\u00E7\u00E3o do motivo fraude
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o de atualiza\u00E7\u00E3o do motivo fraude")
public class MotivoFraudeUpdate  {
  
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Descri\u00E7\u00E3o motivo fraude
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o motivo fraude")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoFraudeUpdate {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
