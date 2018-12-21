package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{dispositivo_persist_description}}}
 **/
@ApiModel(description = "{{{dispositivo_persist_description}}}")
public class DispositivoPersistValue  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;

  
  /**
   * {{{dispositivo_persist_token_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_persist_token_value}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{dispositivo_persist_id_aplicacao_mobile_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_persist_id_aplicacao_mobile_value}}}")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * {{{dispositivo_persist_id_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_persist_id_usuario_value}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispositivoPersistValue {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
