package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Notifica\u00C3\u00A7\u00C3\u00A3o SMS
 **/
@ApiModel(description = "Objeto Notifica\u00C3\u00A7\u00C3\u00A3o SMS")
public class NotificacaoSMSResponse  {
  
  @SerializedName("protocolo")
  private String protocolo = null;
  @SerializedName("mensagem")
  private String mensagem = null;

  
  /**
   * N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do protocolo de envio de notifica\u00C3\u00A7\u00C3\u00B5es")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * Mensagem de resposta da solicita\u00C3\u00A7\u00C3\u00B5es de envio
   **/
  @ApiModelProperty(value = "Mensagem de resposta da solicita\u00C3\u00A7\u00C3\u00B5es de envio")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoSMSResponse {\n");
    
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


