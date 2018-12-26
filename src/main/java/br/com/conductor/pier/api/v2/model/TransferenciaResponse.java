package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto transferencia
 **/
@ApiModel(description = "Objeto transferencia")
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
   * Valor estabelecido para ser transferido
   **/
  @ApiModelProperty(value = "Valor estabelecido para ser transferido")
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
