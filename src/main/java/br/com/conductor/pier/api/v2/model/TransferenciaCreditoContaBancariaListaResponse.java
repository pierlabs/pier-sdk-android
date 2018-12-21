package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{transferencia_credito_conta_bancaria_lista_response_description}}}
 **/
@ApiModel(description = "{{{transferencia_credito_conta_bancaria_lista_response_description}}}")
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
   * {{{transferencia_credito_conta_bancaria_lista_response_id_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_id_transferencia_value}}}")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_valor_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_valor_compra_value}}}")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_valor_contrato_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_valor_contrato_value}}}")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_data_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_data_compra_value}}}")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transferencia_credito_conta_bancaria_lista_response_status_processamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_credito_conta_bancaria_lista_response_status_processamento_value}}}")
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
