package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parametro_produto_partial_update_description}}}
 **/
@ApiModel(description = "{{{parametro_produto_partial_update_description}}}")
public class ParametroProdutoPartialUpdate  {
  
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;

  
  /**
   * {{{parametro_produto_dto_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{parametro_produto_dto_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{parametro_produto_dto_valor_parametro_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_valor_parametro_value}}}")
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
