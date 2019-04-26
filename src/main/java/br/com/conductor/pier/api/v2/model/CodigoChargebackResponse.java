package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do c\u00F3digo de chargeback
 **/
@ApiModel(description = "Objeto de resposta do c\u00F3digo de chargeback")
public class CodigoChargebackResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do c\u00F3digo de chargeback
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do c\u00F3digo de chargeback")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do c\u00F3digo de chargeback
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do c\u00F3digo de chargeback")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoChargebackResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
