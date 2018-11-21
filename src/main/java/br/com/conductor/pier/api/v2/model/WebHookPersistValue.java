package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{web_hook_persist_description}}}
 **/
@ApiModel(description = "{{{web_hook_persist_description}}}")
public class WebHookPersistValue  {
  
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ERRO,  TRANSACAO_SIMULACAO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_TOKEN, 
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
