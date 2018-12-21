package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parametro_produto_persist_description}}}
 **/
@ApiModel(description = "{{{parametro_produto_persist_description}}}")
public class ParametroProdutoPersist  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("tipo")
  private String tipo = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;

  
  /**
   * {{{parametro_produto_dto_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{parametro_produto_dto_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{parametro_produto_dto_data_validade_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{parametro_produto_dto_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{parametro_produto_dto_codigo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{parametro_produto_dto_codigo_value}}}")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * {{{parametro_produto_dto_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{parametro_produto_dto_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{parametro_produto_dto_tipo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{parametro_produto_dto_tipo_value}}}")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
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
    sb.append("class ParametroProdutoPersist {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  tipo: ").append(tipo).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
