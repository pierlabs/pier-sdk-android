package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Requisi\u00E7\u00E3o Solicita\u00E7\u00E3o Envio de OTP
 **/
@ApiModel(description = "Requisi\u00E7\u00E3o Solicita\u00E7\u00E3o Envio de OTP")
public class Secure3dRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("otp")
  private String otp = null;

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * OTP que ser\u00E1 enviado para cliente
   **/
  @ApiModelProperty(value = "OTP que ser\u00E1 enviado para cliente")
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3dRequest {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  otp: ").append(otp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
