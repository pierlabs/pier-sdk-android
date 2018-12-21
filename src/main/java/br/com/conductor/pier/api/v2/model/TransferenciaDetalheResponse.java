package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transfer Object
 **/
@ApiModel(description = "Transfer Object")
public class TransferenciaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataTransferencia")
  private String dataTransferencia = null;
  @SerializedName("idContaOrigem")
  private Long idContaOrigem = null;
  @SerializedName("nomePessoaOrigem")
  private String nomePessoaOrigem = null;
  @SerializedName("idContaDestino")
  private Long idContaDestino = null;
  @SerializedName("nomePessoaDestino")
  private String nomePessoaDestino = null;
  @SerializedName("valorTransferencia")
  private BigDecimal valorTransferencia = null;
  @SerializedName("valorTarifa")
  private BigDecimal valorTarifa = null;

  
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
   * Identification Code of the account which the value will be debited to the transfer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the account which the value will be debited to the transfer (id)")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * Show the full name of the person that made the transfer
   **/
  @ApiModelProperty(value = "Show the full name of the person that made the transfer")
  public String getNomePessoaOrigem() {
    return nomePessoaOrigem;
  }
  public void setNomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
  }

  
  /**
   * Identification Code of the account which the value will be credited to the transfer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the account which the value will be credited to the transfer (id)")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * show the full name of the person that recieved the Transfer
   **/
  @ApiModelProperty(value = "show the full name of the person that recieved the Transfer")
  public String getNomePessoaDestino() {
    return nomePessoaDestino;
  }
  public void setNomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
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

  
  /**
   * Value established of the taxe for the transfer
   **/
  @ApiModelProperty(value = "Value established of the taxe for the transfer")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataTransferencia: ").append(dataTransferencia).append("\n");
    sb.append("  idContaOrigem: ").append(idContaOrigem).append("\n");
    sb.append("  nomePessoaOrigem: ").append(nomePessoaOrigem).append("\n");
    sb.append("  idContaDestino: ").append(idContaDestino).append("\n");
    sb.append("  nomePessoaDestino: ").append(nomePessoaDestino).append("\n");
    sb.append("  valorTransferencia: ").append(valorTransferencia).append("\n");
    sb.append("  valorTarifa: ").append(valorTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
