package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Configura\u00E7\u00E3o SMS
 **/
@ApiModel(description = "Objeto Configura\u00E7\u00E3o SMS")
public class ConfiguracaoSMSResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("usuarioSMS")
  private String usuarioSMS = null;
  @SerializedName("senhaSMS")
  private String senhaSMS = null;

  
  /**
   * Id Configura\u00E7\u00E3o SMS
   **/
  @ApiModelProperty(value = "Id Configura\u00E7\u00E3o SMS")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id emissor
   **/
  @ApiModelProperty(value = "Id emissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Usuario SMS
   **/
  @ApiModelProperty(value = "Usuario SMS")
  public String getUsuarioSMS() {
    return usuarioSMS;
  }
  public void setUsuarioSMS(String usuarioSMS) {
    this.usuarioSMS = usuarioSMS;
  }

  
  /**
   * Senha SMS
   **/
  @ApiModelProperty(value = "Senha SMS")
  public String getSenhaSMS() {
    return senhaSMS;
  }
  public void setSenhaSMS(String senhaSMS) {
    this.senhaSMS = senhaSMS;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoSMSResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  usuarioSMS: ").append(usuarioSMS).append("\n");
    sb.append("  senhaSMS: ").append(senhaSMS).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
