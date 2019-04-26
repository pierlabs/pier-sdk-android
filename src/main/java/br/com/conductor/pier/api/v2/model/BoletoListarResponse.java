package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do boleto de fatura
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do boleto de fatura")
public class BoletoListarResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("valorBoleto")
  private BigDecimal valorBoleto = null;
  @SerializedName("idTipoBoleto")
  private Long idTipoBoleto = null;
  @SerializedName("idCodigoRetornoLayoutCNAB")
  private Integer idCodigoRetornoLayoutCNAB = null;
  @SerializedName("idEventoPagamento")
  private Integer idEventoPagamento = null;
  @SerializedName("statusParcela")
  private Integer statusParcela = null;

  
  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * id_conta
   **/
  @ApiModelProperty(value = "id_conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Nosso n\u00FAmero \u00E9 o c\u00F3digo que o benefici\u00E1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00E3o. Recomenda-se o uso de n\u00FAmeros sequ\u00EAnciais, na gera\u00E7\u00E3o de diversos boletos, para facilitar a identifica\u00E7\u00E3o dos boletos pagos
   **/
  @ApiModelProperty(value = "Nosso n\u00FAmero \u00E9 o c\u00F3digo que o benefici\u00E1rio escolhe para manter controle sobre seus boletos. Esse valor serve para o cedente identificar quais boletos foram pagos ou n\u00E3o. Recomenda-se o uso de n\u00FAmeros sequ\u00EAnciais, na gera\u00E7\u00E3o de diversos boletos, para facilitar a identifica\u00E7\u00E3o dos boletos pagos")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Data do vencimento
   **/
  @ApiModelProperty(value = "Data do vencimento")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Valor do Boleto
   **/
  @ApiModelProperty(value = "Valor do Boleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * Id do tipo de Boleto
   **/
  @ApiModelProperty(value = "Id do tipo de Boleto")
  public Long getIdTipoBoleto() {
    return idTipoBoleto;
  }
  public void setIdTipoBoleto(Long idTipoBoleto) {
    this.idTipoBoleto = idTipoBoleto;
  }

  
  /**
   * Id do c\u00F3digo de retorno do layout CNAB
   **/
  @ApiModelProperty(value = "Id do c\u00F3digo de retorno do layout CNAB")
  public Integer getIdCodigoRetornoLayoutCNAB() {
    return idCodigoRetornoLayoutCNAB;
  }
  public void setIdCodigoRetornoLayoutCNAB(Integer idCodigoRetornoLayoutCNAB) {
    this.idCodigoRetornoLayoutCNAB = idCodigoRetornoLayoutCNAB;
  }

  
  /**
   * Id do pagamento do evento
   **/
  @ApiModelProperty(value = "Id do pagamento do evento")
  public Integer getIdEventoPagamento() {
    return idEventoPagamento;
  }
  public void setIdEventoPagamento(Integer idEventoPagamento) {
    this.idEventoPagamento = idEventoPagamento;
  }

  
  /**
   * Status da parcela
   **/
  @ApiModelProperty(value = "Status da parcela")
  public Integer getStatusParcela() {
    return statusParcela;
  }
  public void setStatusParcela(Integer statusParcela) {
    this.statusParcela = statusParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoListarResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  valorBoleto: ").append(valorBoleto).append("\n");
    sb.append("  idTipoBoleto: ").append(idTipoBoleto).append("\n");
    sb.append("  idCodigoRetornoLayoutCNAB: ").append(idCodigoRetornoLayoutCNAB).append("\n");
    sb.append("  idEventoPagamento: ").append(idEventoPagamento).append("\n");
    sb.append("  statusParcela: ").append(statusParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
