package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Lista dos motivos fraude
 **/
@ApiModel(description = "Lista dos motivos fraude")
public class MotivoFraudeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Identifica\u00E7\u00E3o do motivo da fraude
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do motivo da fraude")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do motivo da fraude
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do motivo da fraude")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MotivoFraudeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
