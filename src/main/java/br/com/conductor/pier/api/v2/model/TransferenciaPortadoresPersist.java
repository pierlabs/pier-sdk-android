package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para realizar a transfer\u00EAncia entre portadores
 **/
@ApiModel(description = "Objeto para realizar a transfer\u00EAncia entre portadores")
public class TransferenciaPortadoresPersist  {
  
  @SerializedName("idPessoaOrigem")
  private Long idPessoaOrigem = null;
  @SerializedName("idPessoaDestino")
  private Long idPessoaDestino = null;
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * Identificador da pessoa de origem
   **/
  @ApiModelProperty(required = true, value = "Identificador da pessoa de origem")
  public Long getIdPessoaOrigem() {
    return idPessoaOrigem;
  }
  public void setIdPessoaOrigem(Long idPessoaOrigem) {
    this.idPessoaOrigem = idPessoaOrigem;
  }

  
  /**
   * Identificador da pessoa de destino
   **/
  @ApiModelProperty(required = true, value = "Identificador da pessoa de destino")
  public Long getIdPessoaDestino() {
    return idPessoaDestino;
  }
  public void setIdPessoaDestino(Long idPessoaDestino) {
    this.idPessoaDestino = idPessoaDestino;
  }

  
  /**
   * Valor da transfer\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Valor da transfer\u00EAncia")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaPortadoresPersist {\n");
    
    sb.append("  idPessoaOrigem: ").append(idPessoaOrigem).append("\n");
    sb.append("  idPessoaDestino: ").append(idPessoaDestino).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
