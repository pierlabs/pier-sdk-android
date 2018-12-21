package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object AccountHistoricPaymentResponse
 **/
@ApiModel(description = "Object AccountHistoricPaymentResponse")
public class ContaHistoricoPagamentoResponse  {
  
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
   * Identification Code of thePayment
   **/
  @ApiModelProperty(value = "Identification Code of thePayment")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * Identification of the Establishment where the Payment was made, when it is the place of payment
   **/
  @ApiModelProperty(value = "Identification of the Establishment where the Payment was made, when it is the place of payment")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Banking Institution where the Payment was made, when this is the place of payment
   **/
  @ApiModelProperty(value = "Identification Code of the Banking Institution where the Payment was made, when this is the place of payment")
  public Long getIdBanco() {
    return idBanco;
  }
  public void setIdBanco(Long idBanco) {
    this.idBanco = idBanco;
  }

  
  /**
   * Identification Code of the Card
   **/
  @ApiModelProperty(value = "Identification Code of the Card")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Value of the Payment
   **/
  @ApiModelProperty(value = "Value of the Payment")
  public BigDecimal getValorPagamento() {
    return valorPagamento;
  }
  public void setValorPagamento(BigDecimal valorPagamento) {
    this.valorPagamento = valorPagamento;
  }

  
  /**
   * Date and Time of the payment. When it is made in a Banking Institution, the time of the payment is shown with the value zero
   **/
  @ApiModelProperty(value = "Date and Time of the payment. When it is made in a Banking Institution, the time of the payment is shown with the value zero")
  public String getDataHoraPagamento() {
    return dataHoraPagamento;
  }
  public void setDataHoraPagamento(String dataHoraPagamento) {
    this.dataHoraPagamento = dataHoraPagamento;
  }

  
  /**
   * Date and Time which the payment register was created
   **/
  @ApiModelProperty(value = "Date and Time which the payment register was created")
  public String getDataHoraEntradaPagamento() {
    return dataHoraEntradaPagamento;
  }
  public void setDataHoraEntradaPagamento(String dataHoraEntradaPagamento) {
    this.dataHoraEntradaPagamento = dataHoraEntradaPagamento;
  }

  
  /**
   * Identification Code of the Payment Status
   **/
  @ApiModelProperty(value = "Identification Code of the Payment Status")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaHistoricoPagamentoResponse {\n");
    
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
