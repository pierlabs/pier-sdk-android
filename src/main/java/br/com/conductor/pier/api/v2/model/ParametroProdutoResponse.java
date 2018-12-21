package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Product Parameter Response
 **/
@ApiModel(description = "Product Parameter Response")
public class ParametroProdutoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  public enum TipoOrigemTransacaoEnum {
     ON_US,  OFF_US, 
  };
  @SerializedName("tipoOrigemTransacao")
  private TipoOrigemTransacaoEnum tipoOrigemTransacao = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valorParametro")
  private BigDecimal valorParametro = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;

  
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
   * Product identifier
   **/
  @ApiModelProperty(value = "Product identifier")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Transaction Type (ON_US or OFF_US)
   **/
  @ApiModelProperty(value = "Transaction Type (ON_US or OFF_US)")
  public TipoOrigemTransacaoEnum getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
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
  public BigDecimal getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(BigDecimal valorParametro) {
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroProdutoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
