package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Classe de retorno das parcelas de acordo
 **/
@ApiModel(description = "Classe de retorno das parcelas de acordo")
public class ParcelaAcordoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idAcordo")
  private Long idAcordo = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("vencimentoParcela")
  private String vencimentoParcela = null;
  @SerializedName("saldoParcela")
  private BigDecimal saldoParcela = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("idBoletoParcela")
  private Long idBoletoParcela = null;

  
  /**
   * C\u00F3digo identificador da parcela do acordo
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da parcela do acordo")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do acordo (Id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do acordo (Id)")
  public Long getIdAcordo() {
    return idAcordo;
  }
  public void setIdAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
  }

  
  /**
   * N\u00FAmero da parcela
   **/
  @ApiModelProperty(value = "N\u00FAmero da parcela")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Data de vencimento da parcela
   **/
  @ApiModelProperty(value = "Data de vencimento da parcela")
  public String getVencimentoParcela() {
    return vencimentoParcela;
  }
  public void setVencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
  }

  
  /**
   * Saldo da parcela
   **/
  @ApiModelProperty(value = "Saldo da parcela")
  public BigDecimal getSaldoParcela() {
    return saldoParcela;
  }
  public void setSaldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
  }

  
  /**
   * Nosso n\u00FAmero gerado por parcela
   **/
  @ApiModelProperty(value = "Nosso n\u00FAmero gerado por parcela")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do boleto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do boleto")
  public Long getIdBoletoParcela() {
    return idBoletoParcela;
  }
  public void setIdBoletoParcela(Long idBoletoParcela) {
    this.idBoletoParcela = idBoletoParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelaAcordoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idAcordo: ").append(idAcordo).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  vencimentoParcela: ").append(vencimentoParcela).append("\n");
    sb.append("  saldoParcela: ").append(saldoParcela).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  idBoletoParcela: ").append(idBoletoParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
