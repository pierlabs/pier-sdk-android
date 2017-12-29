package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Dispositivo
 **/
@ApiModel(description = "Objeto Dispositivo")
public class DispositivoPersist  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;

  
  /**
   * Apresenta o token do dispositivo.
   **/
  @ApiModelProperty(value = "Apresenta o token do dispositivo.")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Apresenta o identificador da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o identificador da aplica\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Apresenta o identificador do usu\u00C3\u00A1rio.
   **/
  @ApiModelProperty(value = "Apresenta o identificador do usu\u00C3\u00A1rio.")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoPersist {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
