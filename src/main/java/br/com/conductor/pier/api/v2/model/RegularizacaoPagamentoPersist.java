package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto a ser persistido de pagamento inv\u00E1lido
 **/
@ApiModel(description = "Objeto a ser persistido de pagamento inv\u00E1lido")
public class RegularizacaoPagamentoPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nossoNumero")
  private BigDecimal nossoNumero = null;
  @SerializedName("valorPago")
  private BigDecimal valorPago = null;

  
  /**
   * Identificador da conta cadastrada na base ap\u00F3s regularizar um pagamento inv\u00E1lido
   **/
  @ApiModelProperty(value = "Identificador da conta cadastrada na base ap\u00F3s regularizar um pagamento inv\u00E1lido")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do boleto do pagamento inv\u00E1lido
   **/
  @ApiModelProperty(value = "N\u00FAmero do boleto do pagamento inv\u00E1lido")
  public BigDecimal getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor do boleto do pagamento inv\u00E1lido
   **/
  @ApiModelProperty(value = "Valor do boleto do pagamento inv\u00E1lido")
  public BigDecimal getValorPago() {
    return valorPago;
  }
  public void setValorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegularizacaoPagamentoPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  valorPago: ").append(valorPago).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
