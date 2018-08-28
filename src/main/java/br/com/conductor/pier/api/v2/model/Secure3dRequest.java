package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{request_secure_3d_description}}}
 **/
@ApiModel(description = "{{{request_secure_3d_description}}}")
public class Secure3dRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("otp")
  private String otp = null;

  
  /**
   * {{{id_cartao_3d_secure}}}
   **/
  @ApiModelProperty(value = "{{{id_cartao_3d_secure}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{id_cartao_3d_secure}}}
   **/
  @ApiModelProperty(value = "{{{id_cartao_3d_secure}}}")
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
