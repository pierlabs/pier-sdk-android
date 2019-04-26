package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPagamento")
  private Long idPagamento = null;
  @SerializedName("idPagamentoRejeitado")
  private Long idPagamentoRejeitado = null;
  @SerializedName("nossoNumero")
  private BigDecimal nossoNumero = null;
  @SerializedName("valorPago")
  private BigDecimal valorPago = null;

  
  /**
   * Identificador da conta de um pagamento inv\u00E1lido regularizado
   **/
  @ApiModelProperty(value = "Identificador da conta de um pagamento inv\u00E1lido regularizado")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id do pagamento inv\u00E1lido
   **/
  @ApiModelProperty(value = "Id do pagamento inv\u00E1lido")
  public Long getIdPagamento() {
    return idPagamento;
  }
  public void setIdPagamento(Long idPagamento) {
    this.idPagamento = idPagamento;
  }

  
  /**
   * Identificador do pagamento inv\u00E1lido regularizado
   **/
  @ApiModelProperty(value = "Identificador do pagamento inv\u00E1lido regularizado")
  public Long getIdPagamentoRejeitado() {
    return idPagamentoRejeitado;
  }
  public void setIdPagamentoRejeitado(Long idPagamentoRejeitado) {
    this.idPagamentoRejeitado = idPagamentoRejeitado;
  }

  
  /**
   * N\u00FAmero do boleto de um pagamento inv\u00E1lido regularizado
   **/
  @ApiModelProperty(value = "N\u00FAmero do boleto de um pagamento inv\u00E1lido regularizado")
  public BigDecimal getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(BigDecimal nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Valor pago de um boleto regularizado
   **/
  @ApiModelProperty(value = "Valor pago de um boleto regularizado")
  public BigDecimal getValorPago() {
    return valorPago;
  }
  public void setValorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPagamento: ").append(idPagamento).append("\n");
    sb.append("  idPagamentoRejeitado: ").append(idPagamentoRejeitado).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  valorPago: ").append(valorPago).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
