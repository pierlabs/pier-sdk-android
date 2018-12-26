package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{notificacao_response_description}}}
 **/
@ApiModel(description = "{{{notificacao_response_description}}}")
public class NotificacaoResponse  {
  
  @SerializedName("protocolo")
  private String protocolo = null;
  @SerializedName("mensagem")
  private String mensagem = null;

  
  /**
   * {{{notificacao_response_protocolo_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_response_protocolo_value}}}")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * {{{notificacao_response_mensagem_value}}}
   **/
  @ApiModelProperty(value = "{{{notificacao_response_mensagem_value}}}")
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
