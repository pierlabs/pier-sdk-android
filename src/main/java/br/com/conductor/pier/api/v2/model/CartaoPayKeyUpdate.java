package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso de atualiza\u00E7\u00E3o de chave
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso de atualiza\u00E7\u00E3o de chave")
public class CartaoPayKeyUpdate  {
  
  @SerializedName("chaveCriptograma")
  private String chaveCriptograma = null;

  
  /**
   * Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada
   **/
  @ApiModelProperty(required = true, value = "Chave de gera\u00E7\u00E3o de transa\u00E7\u00E3o criptografada")
  public String getChaveCriptograma() {
    return chaveCriptograma;
  }
  public void setChaveCriptograma(String chaveCriptograma) {
    this.chaveCriptograma = chaveCriptograma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayKeyUpdate {\n");
    
    sb.append("  chaveCriptograma: ").append(chaveCriptograma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
