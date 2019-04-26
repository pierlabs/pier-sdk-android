package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do dispositivo do usu\u00E1rio
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do dispositivo do usu\u00E1rio")
public class ControleSegurancaDispositivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("phoneId")
  private String phoneId = null;

  
  /**
   * Identificador do registro do dispositivo do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Identificador do registro do dispositivo do usu\u00E1rio")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do usu\u00E1rio
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do usu\u00E1rio")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Identifica\u00E7\u00E3o do dispositivo do usu\u00E1rio (phoneId)
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do dispositivo do usu\u00E1rio (phoneId)")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSegurancaDispositivoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
