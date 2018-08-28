package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{web_hook_response_description}}}
 **/
@ApiModel(description = "{{{web_hook_response_description}}}")
public class WebHookResponse  {
  
  @SerializedName("id")
  private Long id = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  public enum MetodoEnum {
     GET,  POST,  PUT,  DELETE, 
  };
  @SerializedName("metodo")
  private MetodoEnum metodo = null;
  @SerializedName("url")
  private String url = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * {{{web_hook_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{web_hook_response_tipo_evento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_response_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{web_hook_response_metodo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_response_metodo_value}}}")
  public MetodoEnum getMetodo() {
    return metodo;
  }
  public void setMetodo(MetodoEnum metodo) {
    this.metodo = metodo;
  }

  
  /**
   * {{{web_hook_response_url_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_response_url_value}}}")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * {{{web_hook_response_status_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  metodo: ").append(metodo).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
