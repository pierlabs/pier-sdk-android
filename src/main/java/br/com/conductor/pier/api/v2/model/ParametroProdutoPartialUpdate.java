package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parameters used in the product parameter partial update
 **/
@ApiModel(description = "Parameters used in the product parameter partial update")
public class ParametroProdutoPartialUpdate  {
  
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;

  
  /**
   * Product parameter expiration date
   **/
  @ApiModelProperty(value = "Product parameter expiration date")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Description of the product parameter
   **/
  @ApiModelProperty(value = "Description of the product parameter")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Product parameter value
   **/
  @ApiModelProperty(value = "Product parameter value")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroProdutoPartialUpdate {\n");
    
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
