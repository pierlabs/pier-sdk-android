package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto transferencia
 **/
@ApiModel(description = "Objeto transferencia")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transfer\u00EAncia (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data estabelecida para ocorrer a transfer\u00EAncia
   **/
  @ApiModelProperty(value = "Data estabelecida para ocorrer a transfer\u00EAncia")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 debitado para a transfer\u00EAncia. (id)")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * Apresenta o nome completo da pessoa que realizou a Transfer\u00EAncia
   **/
  @ApiModelProperty(value = "Apresenta o nome completo da pessoa que realizou a Transfer\u00EAncia")
  public String getNomePessoaOrigem() {
    return nomePessoaOrigem;
  }
  public void setNomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta em que o valor ser\u00E1 creditado para a transfer\u00EAncia. (id)")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * Apresenta o nome completo da pessoa que recebeu a Transfer\u00EAncia
   **/
  @ApiModelProperty(value = "Apresenta o nome completo da pessoa que recebeu a Transfer\u00EAncia")
  public String getNomePessoaDestino() {
    return nomePessoaDestino;
  }
  public void setNomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
  }

  
  /**
   * Valor estabelecido para ser transferido
   **/
  @ApiModelProperty(value = "Valor estabelecido para ser transferido")
  public BigDecimal getValorTransferencia() {
    return valorTransferencia;
  }
  public void setValorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
  }

  
  /**
   * Valor estabelecido da tarifa para a transfer\u00EAncia
   **/
  @ApiModelProperty(value = "Valor estabelecido da tarifa para a transfer\u00EAncia")
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
