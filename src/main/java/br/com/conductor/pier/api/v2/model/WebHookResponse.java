package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook")
public class WebHookResponse  {
  
  @SerializedName("id")
  private Long id = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  OUTROS, 
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

  
  /**
   * Id do WebHook
   **/
  @ApiModelProperty(required = true, value = "Id do WebHook")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
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
   * M\u00C3\u00A9todo que a ser chamado pelo WebHook
   **/
  @ApiModelProperty(required = true, value = "M\u00C3\u00A9todo que a ser chamado pelo WebHook")
  public MetodoEnum getMetodo() {
    return metodo;
  }
  public void setMetodo(MetodoEnum metodo) {
    this.metodo = metodo;
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
    sb.append("class WebHookResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  metodo: ").append(metodo).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


