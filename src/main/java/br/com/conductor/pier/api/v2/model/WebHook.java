package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto WebHook
 **/
@ApiModel(description = "Objeto WebHook")
public class WebHook  {
  
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  @SerializedName("url")
  private String url = null;

  
  /**
   * TipoEvento a ser chamado pelo WebHook
   **/
  @ApiModelProperty(required = true, value = "TipoEvento a ser chamado pelo WebHook")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * URL que a ser consumida pelo WebHook
   **/
  @ApiModelProperty(required = true, value = "URL que a ser consumida pelo WebHook")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebHook {\n");
    
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
