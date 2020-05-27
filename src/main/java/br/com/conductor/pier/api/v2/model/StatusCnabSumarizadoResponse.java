package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de status CNAB sumarizado
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de status CNAB sumarizado")
public class StatusCnabSumarizadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagGerado")
  private Boolean flagGerado = null;
  @SerializedName("flagEnviado")
  private Boolean flagEnviado = null;
  @SerializedName("flagRegistrado")
  private Boolean flagRegistrado = null;
  @SerializedName("flagPago")
  private Boolean flagPago = null;
  @SerializedName("flagRejeitado")
  private Boolean flagRejeitado = null;
  @SerializedName("flagIgnorado")
  private Boolean flagIgnorado = null;
  @SerializedName("flagSemRange")
  private Boolean flagSemRange = null;

  
  /**
   * C\u00F3digo identificador do status CNAB sumarizado
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do status CNAB sumarizado")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do status CNAB sumarizado
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status CNAB sumarizado")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que indica se foi gerado
   **/
  @ApiModelProperty(value = "Flag que indica se foi gerado")
  public Boolean getFlagGerado() {
    return flagGerado;
  }
  public void setFlagGerado(Boolean flagGerado) {
    this.flagGerado = flagGerado;
  }

  
  /**
   * Flag que indica se foi enviado
   **/
  @ApiModelProperty(value = "Flag que indica se foi enviado")
  public Boolean getFlagEnviado() {
    return flagEnviado;
  }
  public void setFlagEnviado(Boolean flagEnviado) {
    this.flagEnviado = flagEnviado;
  }

  
  /**
   * Flag que indica se foi registrado
   **/
  @ApiModelProperty(value = "Flag que indica se foi registrado")
  public Boolean getFlagRegistrado() {
    return flagRegistrado;
  }
  public void setFlagRegistrado(Boolean flagRegistrado) {
    this.flagRegistrado = flagRegistrado;
  }

  
  /**
   * Flag que indica se foi pago
   **/
  @ApiModelProperty(value = "Flag que indica se foi pago")
  public Boolean getFlagPago() {
    return flagPago;
  }
  public void setFlagPago(Boolean flagPago) {
    this.flagPago = flagPago;
  }

  
  /**
   * Flag que indica se foi rejeitado
   **/
  @ApiModelProperty(value = "Flag que indica se foi rejeitado")
  public Boolean getFlagRejeitado() {
    return flagRejeitado;
  }
  public void setFlagRejeitado(Boolean flagRejeitado) {
    this.flagRejeitado = flagRejeitado;
  }

  
  /**
   * Flag que indica se foi ignorado
   **/
  @ApiModelProperty(value = "Flag que indica se foi ignorado")
  public Boolean getFlagIgnorado() {
    return flagIgnorado;
  }
  public void setFlagIgnorado(Boolean flagIgnorado) {
    this.flagIgnorado = flagIgnorado;
  }

  
  /**
   * Flag que indica se n\u00E3o possui range
   **/
  @ApiModelProperty(value = "Flag que indica se n\u00E3o possui range")
  public Boolean getFlagSemRange() {
    return flagSemRange;
  }
  public void setFlagSemRange(Boolean flagSemRange) {
    this.flagSemRange = flagSemRange;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCnabSumarizadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagGerado: ").append(flagGerado).append("\n");
    sb.append("  flagEnviado: ").append(flagEnviado).append("\n");
    sb.append("  flagRegistrado: ").append(flagRegistrado).append("\n");
    sb.append("  flagPago: ").append(flagPago).append("\n");
    sb.append("  flagRejeitado: ").append(flagRejeitado).append("\n");
    sb.append("  flagIgnorado: ").append(flagIgnorado).append("\n");
    sb.append("  flagSemRange: ").append(flagSemRange).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
