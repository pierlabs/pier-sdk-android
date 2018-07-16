package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.LancamentoFaturaResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{fatura_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{fatura_detalhe_response_description}}}")
public class FaturaDetalheResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  public enum SituacaoProcessamentoEnum {
     ABERTA,  FECHADA,  TODAS, 
  };
  @SerializedName("situacaoProcessamento")
  private SituacaoProcessamentoEnum situacaoProcessamento = null;
  @SerializedName("pagamentoEfetuado")
  private Boolean pagamentoEfetuado = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataFechamento")
  private String dataFechamento = null;
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("valorPagamentoMinimo")
  private BigDecimal valorPagamentoMinimo = null;
  @SerializedName("lancamentosFaturaResponse")
  private List<LancamentoFaturaResponse> lancamentosFaturaResponse = null;
  @SerializedName("saldoAnterior")
  private BigDecimal saldoAnterior = null;

  
  /**
   * {{{fatura_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_response_situacao_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_situacao_processamento_value}}}")
  public SituacaoProcessamentoEnum getSituacaoProcessamento() {
    return situacaoProcessamento;
  }
  public void setSituacaoProcessamento(SituacaoProcessamentoEnum situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  
  /**
   * {{{fatura_response_pagamento_efetuado_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_pagamento_efetuado_value}}}")
  public Boolean getPagamentoEfetuado() {
    return pagamentoEfetuado;
  }
  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  
  /**
   * {{{fatura_response_data_vencimento_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_data_vencimento_fatura_value}}}")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_response_data_vencimento_real_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_data_vencimento_real_value}}}")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{fatura_response_data_fechamento_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_data_fechamento_value}}}")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * {{{fatura_response_valor_total_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_valor_total_value}}}")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  
  /**
   * {{{fatura_response_valor_pagamento_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_valor_pagamento_minimo_value}}}")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_detalhe_response_lancamentos_fatura_response_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_detalhe_response_lancamentos_fatura_response_value}}}")
  public List<LancamentoFaturaResponse> getLancamentosFaturaResponse() {
    return lancamentosFaturaResponse;
  }
  public void setLancamentosFaturaResponse(List<LancamentoFaturaResponse> lancamentosFaturaResponse) {
    this.lancamentosFaturaResponse = lancamentosFaturaResponse;
  }

  
  /**
   * {{{fatura_response_saldo_anterior_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_response_saldo_anterior_value}}}")
  public BigDecimal getSaldoAnterior() {
    return saldoAnterior;
  }
  public void setSaldoAnterior(BigDecimal saldoAnterior) {
    this.saldoAnterior = saldoAnterior;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaDetalheResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  situacaoProcessamento: ").append(situacaoProcessamento).append("\n");
    sb.append("  pagamentoEfetuado: ").append(pagamentoEfetuado).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  lancamentosFaturaResponse: ").append(lancamentosFaturaResponse).append("\n");
    sb.append("  saldoAnterior: ").append(saldoAnterior).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


