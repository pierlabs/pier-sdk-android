package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa um objeto de resposta para pagamentos inv\u00E1lidos
 **/
@ApiModel(description = "Representa um objeto de resposta para pagamentos inv\u00E1lidos")
public class PagamentosInvalidosResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("dataPagamento")
  private String dataPagamento = null;
  @SerializedName("valorPago")
  private BigDecimal valorPago = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * C\u00F3digo identificador do pagamento inv\u00E1lido
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do pagamento inv\u00E1lido")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do banco
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Data de pagamento do boleto
   **/
  @ApiModelProperty(value = "Data de pagamento do boleto")
  public String getDataPagamento() {
    return dataPagamento;
  }
  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  
  /**
   * Valor pago da fatura
   **/
  @ApiModelProperty(value = "Valor pago da fatura")
  public BigDecimal getValorPago() {
    return valorPago;
  }
  public void setValorPago(BigDecimal valorPago) {
    this.valorPago = valorPago;
  }

  
  /**
   * Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagamentosInvalidosResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  dataPagamento: ").append(dataPagamento).append("\n");
    sb.append("  valorPago: ").append(valorPago).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
