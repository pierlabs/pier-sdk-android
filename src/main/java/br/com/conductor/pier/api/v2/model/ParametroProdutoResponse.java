package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resposta de par\u00E2metros de produto
 **/
@ApiModel(description = "Resposta de par\u00E2metros de produto")
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
   * Identificador do produto
   **/
  @ApiModelProperty(value = "Identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Tipo da Transa\u00E7\u00E3o (ON_US ou OFF_US)
   **/
  @ApiModelProperty(value = "Tipo da Transa\u00E7\u00E3o (ON_US ou OFF_US)")
  public TipoOrigemTransacaoEnum getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
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
  public BigDecimal getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(BigDecimal valorParametro) {
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
