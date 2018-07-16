package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{historico_pagamento_response_description}}}
 **/
@ApiModel(description = "{{{historico_pagamento_response_description}}}")
public class HistoricoPagamentoResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPagamento")
  private Long idPagamento = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idBanco")
  private Long idBanco = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valorPagamento")
  private BigDecimal valorPagamento = null;
  @SerializedName("dataHoraPagamento")
  private String dataHoraPagamento = null;
  @SerializedName("dataHoraEntradaPagamento")
  private String dataHoraEntradaPagamento = null;
  @SerializedName("status")
  private Long status = null;

  
  /**
   * {{{historico_pagamento_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{historico_pagamento_response_id_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_id_pagamento_value}}}")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{historico_pagamento_response_id_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_id_banco_value}}}")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * {{{historico_pagamento_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{historico_pagamento_response_valor_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_valor_pagamento_value}}}")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_data_hora_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_data_hora_pagamento_value}}}")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_data_hora_entrada_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_data_hora_entrada_pagamento_value}}}")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * {{{historico_pagamento_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_pagamento_response_status_value}}}")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoPagamentoResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPagamento: ").append(idPagamento).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idBanco: ").append(idBanco).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valorPagamento: ").append(valorPagamento).append("\n");
    sb.append("  dataHoraPagamento: ").append(dataHoraPagamento).append("\n");
    sb.append("  dataHoraEntradaPagamento: ").append(dataHoraEntradaPagamento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


