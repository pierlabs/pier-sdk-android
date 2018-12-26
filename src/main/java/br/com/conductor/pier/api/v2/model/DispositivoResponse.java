package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Dispositivo Mobile
 **/
@ApiModel(description = "Dispositivo Mobile")
public class DispositivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;

  
  /**
   * Identificador do dispositivo
   **/
  @ApiModelProperty(value = "Identificador do dispositivo")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Token do dispositivo
   **/
  @ApiModelProperty(value = "Token do dispositivo")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Identificador da Aplica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador da Aplica\u00E7\u00E3o")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Identificador do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Identificador do usu\u00E1rio")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
