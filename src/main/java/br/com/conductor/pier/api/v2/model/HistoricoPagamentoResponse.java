package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto HistoricoPagamentoResponse
 **/
@ApiModel(description = "Objeto HistoricoPagamentoResponse")
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
  @SerializedName("nossoNumero")
  private Long nossoNumero = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor do Pagamento
   **/
  @ApiModelProperty(value = "Valor do Pagamento")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero
   **/
  @ApiModelProperty(value = "Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * Data e Hora em que o registro do Pagamento foi cadastrado
   **/
  @ApiModelProperty(value = "Data e Hora em que o registro do Pagamento foi cadastrado")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do nosso n\u00FAmero
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do nosso n\u00FAmero")
  public Long getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(Long nossoNumero) {
    this.nossoNumero = nossoNumero;
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
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
