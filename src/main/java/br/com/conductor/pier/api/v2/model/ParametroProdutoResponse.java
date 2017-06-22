package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto de Resposta Par\u00C3\u00A2metro Produto
 **/
@ApiModel(description = "Objeto de Resposta Par\u00C3\u00A2metro Produto")
public class ParametroProdutoResponse  {
  
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON_US ou OFF_US).
   **/
  @ApiModelProperty(required = true, value = "Tipo da Transa\u00C3\u00A7\u00C3\u00A3o (ON_US ou OFF_US).")
  public TipoOrigemTransacaoEnum getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do Tipo da Transa\u00C3\u00A7\u00C3\u00A3o.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do Par\u00C3\u00A2metro.
   **/
  @ApiModelProperty(required = true, value = "Valor do Par\u00C3\u00A2metro.")
  public BigDecimal getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(BigDecimal valorParametro) {
    this.valorParametro = valorParametro;
  }

  
  /**
   * Data de Validade do Par\u00C3\u00A2metro do Produto.
   **/
  @ApiModelProperty(required = true, value = "Data de Validade do Par\u00C3\u00A2metro do Produto.")
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
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valorParametro: ").append(valorParametro).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


