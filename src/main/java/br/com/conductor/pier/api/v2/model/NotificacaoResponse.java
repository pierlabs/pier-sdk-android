package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Notification SMS
 **/
@ApiModel(description = "Object Notification SMS")
public class NotificacaoResponse  {
  
  @SerializedName("protocolo")
  private String protocolo = null;
  @SerializedName("mensagem")
  private String mensagem = null;

  
  /**
   * Protocol Number of the notification sending
   **/
  @ApiModelProperty(value = "Protocol Number of the notification sending")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * Response Message of the sending resquests
   **/
  @ApiModelProperty(value = "Response Message of the sending resquests")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoResponse {\n");
    
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
