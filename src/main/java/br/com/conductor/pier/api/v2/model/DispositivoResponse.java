package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{dispositivo_response_description}}}
 **/
@ApiModel(description = "{{{dispositivo_response_description}}}")
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
   * {{{dispositivo_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{dispositivo_response_token_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_response_token_value}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{dispositivo_response_id_aplicacao_mobile_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_response_id_aplicacao_mobile_value}}}")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * {{{dispositivo_response_id_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{dispositivo_response_id_usuario_value}}}")
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


