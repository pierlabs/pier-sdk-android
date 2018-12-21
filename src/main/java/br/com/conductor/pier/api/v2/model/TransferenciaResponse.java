package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object transfer
 **/
@ApiModel(description = "Object transfer")
public class TransferenciaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataTransferencia")
  private String dataTransferencia = null;
  @SerializedName("idContaOrigem")
  private Long idContaOrigem = null;
  @SerializedName("idContaDestino")
  private Long idContaDestino = null;
  @SerializedName("valorTransferencia")
  private BigDecimal valorTransferencia = null;

  
  /**
   * Identification Code of the transfer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the transfer (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Date established to occur the transfer
   **/
  @ApiModelProperty(value = "Date established to occur the transfer")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * Identification Code of the account which value will be debited to the transfer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the account which value will be debited to the transfer (id)")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * Identification of the account which value will be credited to the transfer (id)
   **/
  @ApiModelProperty(value = "Identification of the account which value will be credited to the transfer (id)")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * Value established to be transfered
   **/
  @ApiModelProperty(value = "Value established to be transfered")
  public BigDecimal getValorTransferencia() {
    return valorTransferencia;
  }
  public void setValorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataTransferencia: ").append(dataTransferencia).append("\n");
    sb.append("  idContaOrigem: ").append(idContaOrigem).append("\n");
    sb.append("  idContaDestino: ").append(idContaDestino).append("\n");
    sb.append("  valorTransferencia: ").append(valorTransferencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
