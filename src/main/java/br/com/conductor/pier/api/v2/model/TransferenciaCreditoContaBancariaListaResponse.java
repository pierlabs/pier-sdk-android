package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Listagem de Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/
@ApiModel(description = "Listagem de Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
public class TransferenciaCreditoContaBancariaListaResponse  {
  
  @SerializedName("idTransferencia")
  private Long idTransferencia = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("statusProcessamento")
  private String statusProcessamento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia.")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "Data da transfer\u00C3\u00AAncia.")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
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
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  statusProcessamento: ").append(statusProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
