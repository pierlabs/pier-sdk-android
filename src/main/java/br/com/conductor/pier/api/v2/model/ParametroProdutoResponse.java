package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parametro_produto_response_description}}}
 **/
@ApiModel(description = "{{{parametro_produto_response_description}}}")
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
   * {{{parametro_produto_dto_id_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{parametro_produto_dto_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{parametro_produto_dto_tipo_origem_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{parametro_produto_dto_tipo_origem_transacao_value}}}")
  public TipoOrigemTransacaoEnum getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(TipoOrigemTransacaoEnum tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
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
  public BigDecimal getValorParametro() {
    return valorParametro;
  }
  public void setValorParametro(BigDecimal valorParametro) {
    this.valorParametro = valorParametro;
  }

  
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
