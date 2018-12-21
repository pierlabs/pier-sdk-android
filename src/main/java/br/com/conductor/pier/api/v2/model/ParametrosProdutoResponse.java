package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Product Parameter Response
 **/
@ApiModel(description = "Product Parameter Response")
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
   * Product parameter identifier
   **/
  @ApiModelProperty(value = "Product parameter identifier")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Product parameter code
   **/
  @ApiModelProperty(value = "Product parameter code")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
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
   * Product Parameter Type
   **/
  @ApiModelProperty(value = "Product Parameter Type")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Product identifier
   **/
  @ApiModelProperty(value = "Product identifier")
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
