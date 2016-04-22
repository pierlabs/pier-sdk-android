package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarSaldoLimitesResponse  {
  
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;
  @SerializedName("disponibCompraNac")
  private Double disponibCompraNac = null;
  @SerializedName("disponibGlobalCredito")
  private Double disponibGlobalCredito = null;
  @SerializedName("disponibParceladoNac")
  private Double disponibParceladoNac = null;
  @SerializedName("disponibParcelasNac")
  private Double disponibParcelasNac = null;
  @SerializedName("disponibSaqueNacGlobal")
  private Double disponibSaqueNacGlobal = null;
  @SerializedName("limiteCompraNac")
  private Double limiteCompraNac = null;
  @SerializedName("limiteGlobalCredito")
  private Double limiteGlobalCredito = null;
  @SerializedName("limiteParceladoNac")
  private Double limiteParceladoNac = null;
  @SerializedName("limiteParcelasNac")
  private Double limiteParcelasNac = null;
  @SerializedName("limiteSaqueNacGlobal")
  private Double limiteSaqueNacGlobal = null;
  @SerializedName("saldoAtualFinal")
  private Double saldoAtualFinal = null;
  @SerializedName("saldoDevedor")
  private Double saldoDevedor = null;
  @SerializedName("saldoFuturo")
  private Double saldoFuturo = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibCompraNac() {
    return disponibCompraNac;
  }
  public void setDisponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibGlobalCredito() {
    return disponibGlobalCredito;
  }
  public void setDisponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibParceladoNac() {
    return disponibParceladoNac;
  }
  public void setDisponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibParcelasNac() {
    return disponibParcelasNac;
  }
  public void setDisponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibSaqueNacGlobal() {
    return disponibSaqueNacGlobal;
  }
  public void setDisponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteCompraNac() {
    return limiteCompraNac;
  }
  public void setLimiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteParceladoNac() {
    return limiteParceladoNac;
  }
  public void setLimiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteParcelasNac() {
    return limiteParcelasNac;
  }
  public void setLimiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteSaqueNacGlobal() {
    return limiteSaqueNacGlobal;
  }
  public void setLimiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoFuturo() {
    return saldoFuturo;
  }
  public void setSaldoFuturo(Double saldoFuturo) {
    this.saldoFuturo = saldoFuturo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarSaldoLimitesResponse {\n");
    
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("  disponibCompraNac: ").append(disponibCompraNac).append("\n");
    sb.append("  disponibGlobalCredito: ").append(disponibGlobalCredito).append("\n");
    sb.append("  disponibParceladoNac: ").append(disponibParceladoNac).append("\n");
    sb.append("  disponibParcelasNac: ").append(disponibParcelasNac).append("\n");
    sb.append("  disponibSaqueNacGlobal: ").append(disponibSaqueNacGlobal).append("\n");
    sb.append("  limiteCompraNac: ").append(limiteCompraNac).append("\n");
    sb.append("  limiteGlobalCredito: ").append(limiteGlobalCredito).append("\n");
    sb.append("  limiteParceladoNac: ").append(limiteParceladoNac).append("\n");
    sb.append("  limiteParcelasNac: ").append(limiteParcelasNac).append("\n");
    sb.append("  limiteSaqueNacGlobal: ").append(limiteSaqueNacGlobal).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoDevedor: ").append(saldoDevedor).append("\n");
    sb.append("  saldoFuturo: ").append(saldoFuturo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


