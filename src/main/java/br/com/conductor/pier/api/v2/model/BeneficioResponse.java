package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do benef\u00EDcio
 **/
@ApiModel(description = "Objeto de resposta do benef\u00EDcio")
public class BeneficioResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("numeroBeneficio")
  private String numeroBeneficio = null;
  @SerializedName("mesProvaVida")
  private Integer mesProvaVida = null;
  @SerializedName("status")
  private Boolean status = null;
  @SerializedName("tipoBeneficio")
  private String tipoBeneficio = null;

  
  /**
   * Identificador do benef\u00EDcio
   **/
  @ApiModelProperty(value = "Identificador do benef\u00EDcio")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero do benef\u00EDcio
   **/
  @ApiModelProperty(value = "N\u00FAmero do benef\u00EDcio")
  public String getNumeroBeneficio() {
    return numeroBeneficio;
  }
  public void setNumeroBeneficio(String numeroBeneficio) {
    this.numeroBeneficio = numeroBeneficio;
  }

  
  /**
   * M\u00EAs de prova de vida do benefici\u00E1rio
   **/
  @ApiModelProperty(value = "M\u00EAs de prova de vida do benefici\u00E1rio")
  public Integer getMesProvaVida() {
    return mesProvaVida;
  }
  public void setMesProvaVida(Integer mesProvaVida) {
    this.mesProvaVida = mesProvaVida;
  }

  
  /**
   * Status do benef\u00EDcio(1 = ATIVO, 0 = INATIVO)
   **/
  @ApiModelProperty(value = "Status do benef\u00EDcio(1 = ATIVO, 0 = INATIVO)")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * Tipo do benef\u00EDcio
   **/
  @ApiModelProperty(value = "Tipo do benef\u00EDcio")
  public String getTipoBeneficio() {
    return tipoBeneficio;
  }
  public void setTipoBeneficio(String tipoBeneficio) {
    this.tipoBeneficio = tipoBeneficio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  numeroBeneficio: ").append(numeroBeneficio).append("\n");
    sb.append("  mesProvaVida: ").append(mesProvaVida).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tipoBeneficio: ").append(tipoBeneficio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
