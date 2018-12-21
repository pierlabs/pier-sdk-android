package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{secure_3d_request_description}}}
 **/
@ApiModel(description = "{{{secure_3d_request_description}}}")
public class Secure3dRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("otp")
  private String otp = null;

  
  /**
   * {{{secure_3d_request_id_cartao}}}
   **/
  @ApiModelProperty(value = "{{{secure_3d_request_id_cartao}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{secure_3d_request_otp_3d_secure}}}
   **/
  @ApiModelProperty(value = "{{{secure_3d_request_otp_3d_secure}}}")
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
