package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros utilizados na altera\u00E7\u00E3o parcial de par\u00E2metros de produto 
 **/
@ApiModel(description = "Par\u00E2metros utilizados na altera\u00E7\u00E3o parcial de par\u00E2metros de produto ")
public class ParametroProdutoPartialUpdate  {
  
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;

  
  /**
   * Data de validade do par\u00E2metro de produto
   **/
  @ApiModelProperty(value = "Data de validade do par\u00E2metro de produto")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro de produto
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do par\u00E2metro de produto")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do par\u00E2metro do produto
   **/
  @ApiModelProperty(value = "Valor do par\u00E2metro do produto")
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
