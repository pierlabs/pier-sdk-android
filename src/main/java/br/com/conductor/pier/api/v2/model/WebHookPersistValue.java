package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{web_hook_persist_description}}}
 **/
@ApiModel(description = "{{{web_hook_persist_description}}}")
public class WebHookPersistValue  {
  
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  @SerializedName("url")
  private String url = null;

  
  /**
   * {{{web_hook_persist_tipo_evento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_persist_tipo_evento_value}}}")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{web_hook_persist_url_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{web_hook_persist_url_value}}}")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHookPersistValue {\n");
    
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
