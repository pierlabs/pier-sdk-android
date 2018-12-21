package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parameters used in the product parameter register
 **/
@ApiModel(description = "Parameters used in the product parameter register")
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
   * Product identifier
   **/
  @ApiModelProperty(required = true, value = "Product identifier")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Product parameter expiration date
   **/
  @ApiModelProperty(required = true, value = "Product parameter expiration date")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Product parameter code
   **/
  @ApiModelProperty(required = true, value = "Product parameter code")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  /**
   * Description of the product parameter
   **/
  @ApiModelProperty(required = true, value = "Description of the product parameter")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Product Parameter Type
   **/
  @ApiModelProperty(required = true, value = "Product Parameter Type")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
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
