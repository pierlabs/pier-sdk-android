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
  @SerializedName("dataVencimentoParcelaAcordo")
  private String dataVencimentoParcelaAcordo = null;
  @SerializedName("status")
  private Long status = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Pagamento
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Pagamento")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento.")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Institui\u00C3\u00A7\u00C3\u00A3o Banc\u00C3\u00A1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Institui\u00C3\u00A7\u00C3\u00A3o Banc\u00C3\u00A1ria onde o Pagamento foi realizado, quando este for o local de pagamento")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o")
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
   * Data e Hora da realiza\u00C3\u00A7\u00C3\u00A3o do Pagamento. Quando feito em Institui\u00C3\u00A7\u00C3\u00A3o Banc\u00C3\u00A1ria, o hor\u00C3\u00A1rio do pagamento \u00C3\u00A9 exibido com valor zero
   **/
  @ApiModelProperty(value = "Data e Hora da realiza\u00C3\u00A7\u00C3\u00A3o do Pagamento. Quando feito em Institui\u00C3\u00A7\u00C3\u00A3o Banc\u00C3\u00A1ria, o hor\u00C3\u00A1rio do pagamento \u00C3\u00A9 exibido com valor zero")
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
   * Data e Hora do vencimento da parcela do acordo
   **/
  @ApiModelProperty(value = "Data e Hora do vencimento da parcela do acordo")
  public String getDataVencimentoParcelaAcordo() {
    return dataVencimentoParcelaAcordo;
  }
  public void setDataVencimentoParcelaAcordo(String dataVencimentoParcelaAcordo) {
    this.dataVencimentoParcelaAcordo = dataVencimentoParcelaAcordo;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Pagamento
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Pagamento")
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
    sb.append("  dataVencimentoParcelaAcordo: ").append(dataVencimentoParcelaAcordo).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
