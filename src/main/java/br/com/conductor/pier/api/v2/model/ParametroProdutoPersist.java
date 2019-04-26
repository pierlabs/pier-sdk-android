package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros utilizados no cadastro de par\u00E2metros de produto
 **/
@ApiModel(description = "Par\u00E2metros utilizados no cadastro de par\u00E2metros de produto")
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
   * Identificador do produto
   **/
  @ApiModelProperty(required = true, value = "Identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Data de validade do par\u00E2metro de produto
   **/
  @ApiModelProperty(required = true, value = "Data de validade do par\u00E2metro de produto")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3digo do par\u00E2metro do produto
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do par\u00E2metro do produto")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Descri\u00E7\u00E3o do par\u00E2metro de produto
   **/
  @ApiModelProperty(required = true, value = "Descri\u00E7\u00E3o do par\u00E2metro de produto")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Tipo do par\u00E2metro de produto
   **/
  @ApiModelProperty(required = true, value = "Tipo do par\u00E2metro de produto")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
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
