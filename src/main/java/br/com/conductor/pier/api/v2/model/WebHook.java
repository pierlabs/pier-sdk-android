package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso WebHook")
public class WebHook  {
  
  @SerializedName("id")
  private Long id = null;
  public enum EventoEnum {
     RISCO_FRAUDE,  OUTROS, 
  };
  @SerializedName("evento")
  private EventoEnum evento = null;
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
   * Evento a ser chamado pelo WebHook
   **/
  @ApiModelProperty(required = true, value = "Evento a ser chamado pelo WebHook")
  public EventoEnum getEvento() {
    return evento;
  }
  public void setEvento(EventoEnum evento) {
    this.evento = evento;
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
    sb.append("class WebHook {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  evento: ").append(evento).append("\n");
    sb.append("  metodo: ").append(metodo).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


