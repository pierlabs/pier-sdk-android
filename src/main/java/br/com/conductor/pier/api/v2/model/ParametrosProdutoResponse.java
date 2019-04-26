package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resposta de par\u00E2metros de produto
 **/
@ApiModel(description = "Resposta de par\u00E2metros de produto")
public class ParametrosProdutoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valorParametro")
  private String valorParametro = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("tipo")
  private String tipo = null;
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * Identificador do par\u00E2metro de produto
   **/
  @ApiModelProperty(value = "Identificador do par\u00E2metro de produto")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do par\u00E2metro do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo do par\u00E2metro do produto")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
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
   * Valor dos par\u00E2metro do produto
   **/
  @ApiModelProperty(value = "Valor dos par\u00E2metro do produto")
  public String getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(String valorParametro) {
    this.valorParametro = valorParametro;
  }

  
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
   * Tipo do par\u00E2metro de produto
   **/
  @ApiModelProperty(value = "Tipo do par\u00E2metro de produto")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Identificador do produto
   **/
  @ApiModelProperty(value = "Identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosProdutoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  tipo: ").append(tipo).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
