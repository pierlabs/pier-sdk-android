package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto identificador da atualiza\u00E7\u00E3o do dispositivo do usu\u00E1rio
 **/
@ApiModel(description = "Objeto identificador da atualiza\u00E7\u00E3o do dispositivo do usu\u00E1rio")
public class UsuarioDispositivoUpdate  {
  
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("phoneId")
  private String phoneId = null;

  
  /**
   * C\u00F3digo identificador do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do usu\u00E1rio")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * C\u00F3digo identificador do dispositivo do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do dispositivo do usu\u00E1rio")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioDispositivoUpdate {\n");
    
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
