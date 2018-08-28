package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{cartao_pay_key_update_description}}}
 **/
@ApiModel(description = "{{{cartao_pay_key_update_description}}}")
public class CartaoPayKeyUpdate  {
  
  @SerializedName("chaveCriptograma")
  private String chaveCriptograma = null;

  
  /**
   * {{{cartao_pay_key_update_chave_criptograma_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{cartao_pay_key_update_chave_criptograma_value}}}")
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
