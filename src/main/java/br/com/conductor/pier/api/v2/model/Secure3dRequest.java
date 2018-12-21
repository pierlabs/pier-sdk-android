package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request from OTP requisition
 **/
@ApiModel(description = "Request from OTP requisition")
public class Secure3dRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("otp")
  private String otp = null;

  
  /**
   * Identifier Account's card
   **/
  @ApiModelProperty(value = "Identifier Account's card")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * OTP will send to client
   **/
  @ApiModelProperty(value = "OTP will send to client")
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
