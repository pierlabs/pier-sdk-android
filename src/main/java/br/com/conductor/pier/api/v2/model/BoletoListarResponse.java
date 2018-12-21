package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of bank slips response
 **/
@ApiModel(description = "Representation of bank slips response")
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
   * id_account
   **/
  @ApiModelProperty(value = "id_account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Our number is the code that the beneficiary choose to keep control on the bank slip. This value serves to the identifier which bank slips were paid or not. It is recommended the use of the sequencial numbers, to create lots of bank slips, to facilitate the identification of the paid bank slips
   **/
  @ApiModelProperty(value = "Our number is the code that the beneficiary choose to keep control on the bank slip. This value serves to the identifier which bank slips were paid or not. It is recommended the use of the sequencial numbers, to create lots of bank slips, to facilitate the identification of the paid bank slips")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * Date of the expiration
   **/
  @ApiModelProperty(value = "Date of the expiration")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Value of the Bank slip
   **/
  @ApiModelProperty(value = "Value of the Bank slip")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * id_type_bank_slip
   **/
  @ApiModelProperty(value = "id_type_bank_slip")
  public Long getIdTipoBoleto() {
    return idTipoBoleto;
  }
  public void setIdTipoBoleto(Long idTipoBoleto) {
    this.idTipoBoleto = idTipoBoleto;
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
    sb.append("}\n");
    return sb.toString();
  }
}
