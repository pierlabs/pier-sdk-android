package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{parcela_acordo_response_description}}}
 **/
@ApiModel(description = "{{{parcela_acordo_response_description}}}")
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
   * {{{parcela_acordo_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{parcela_acordo_response_id_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_id_acordo_value}}}")
  public Long getIdAcordo() {
    return idAcordo;
  }
  public void setIdAcordo(Long idAcordo) {
    this.idAcordo = idAcordo;
  }

  
  /**
   * {{{parcela_acordo_response_numero_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_numero_parcela_value}}}")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{parcela_acordo_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{parcela_acordo_response_vencimento_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_vencimento_parcela_value}}}")
  public String getVencimentoParcela() {
    return vencimentoParcela;
  }
  public void setVencimentoParcela(String vencimentoParcela) {
    this.vencimentoParcela = vencimentoParcela;
  }

  
  /**
   * {{{parcela_acordo_response_saldo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_saldo_parcela_value}}}")
  public BigDecimal getSaldoParcela() {
    return saldoParcela;
  }
  public void setSaldoParcela(BigDecimal saldoParcela) {
    this.saldoParcela = saldoParcela;
  }

  
  /**
   * {{{parcela_acordo_response_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_nosso_numero_value}}}")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{parcela_acordo_response_id_boleto_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{parcela_acordo_response_id_boleto_parcela_value}}}")
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
