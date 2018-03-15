package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Listagem de Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias
 **/
@ApiModel(description = "Listagem de Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias")
public class TransferenciaCreditoContaBancariaListaResponse  {
  
  @SerializedName("idTransferencia")
  private Long idTransferencia = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("statusProcessamento")
  private String statusProcessamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transferencia.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transferencia.")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor da transfer\u00EAncia.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00EAncia.")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da transfer\u00EAncia acrescido do valor da tarifa de saque se houver tarifa de saque.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00EAncia acrescido do valor da tarifa de saque se houver tarifa de saque.")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Data da transfer\u00EAncia.
   **/
  @ApiModelProperty(value = "Data da transfer\u00EAncia.")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * C\u00F3digo de status de processamento.
   **/
  @ApiModelProperty(value = "C\u00F3digo de status de processamento.")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Status Processamento.
   **/
  @ApiModelProperty(value = "Status Processamento.")
  public String getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaListaResponse {\n");
    
    sb.append("  idTransferencia: ").append(idTransferencia).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusProcessamento: ").append(statusProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
