package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters of a Bank Slip
 **/
@ApiModel(description = "Request Parameters of a Bank Slip")
public class BoletoRequest  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tipoBoleto")
  private Long tipoBoleto = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * Account ID code (id)
   **/
  @ApiModelProperty(required = true, value = "Account ID code (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the type of BAnk slip (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the type of BAnk slip (id)")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * Value of Ticket
   **/
  @ApiModelProperty(required = true, value = "Value of Ticket")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Due Date
   **/
  @ApiModelProperty(required = true, value = "Due Date")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Covenant Code from the Charging
   **/
  @ApiModelProperty(value = "Covenant Code from the Charging")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoRequest {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tipoBoleto: ").append(tipoBoleto).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
