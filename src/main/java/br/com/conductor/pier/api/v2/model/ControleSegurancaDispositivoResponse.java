package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of user device response
 **/
@ApiModel(description = "Representation of user device response")
public class ControleSegurancaDispositivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("phoneId")
  private String phoneId = null;

  
  /**
   * User device record identifier
   **/
  @ApiModelProperty(value = "User device record identifier")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * User identifier code
   **/
  @ApiModelProperty(value = "User identifier code")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User device identification (phoneId)
   **/
  @ApiModelProperty(value = "User device identification (phoneId)")
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
