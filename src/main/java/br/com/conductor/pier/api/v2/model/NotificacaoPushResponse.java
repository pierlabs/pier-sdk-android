package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para o push de notifica\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de resposta para o push de notifica\u00E7\u00E3o")
public class NotificacaoPushResponse  {
  
  @SerializedName("dataEnvio")
  private String dataEnvio = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ADVICE_NAO_AUTORIZADO,  TRANSACAO_ERRO,  TRANSACAO_ERRO_NAO_AUTORIZADO,  TRANSACAO_SIMULACAO,  TRANSACAO_SIMULACAO_NAO_AUTORIZADO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_SENHA_CHIP_NAO_AUTORIZADO,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_SALDO_NAO_AUTORIZADO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_CONSULTA_STATUS_CONTA_NAO_AUTORIZADO,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_DESFAZIMENTO_NAO_AUTORIZADO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_CANCELAMENTO_NAO_AUTORIZADO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_RESPOSTA_SONDA_NAO_AUTORIZADO,  TRANSACAO_TOKEN,  TRANSACAO_TOKEN_NAO_AUTORIZADO, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  public enum StatusEnum {
     PENDENTE,  ENCAMINHADO,  ENVIADO,  RESPONDIDO,  ERRO,  ERRO_RESPOSTA,  SUCESSO_RESPOSTA, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tokenDispositivo")
  private String tokenDispositivo = null;
  @SerializedName("titulo")
  private String titulo = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  public enum PlataformaEnum {
     APNS,  FCM,  GCM, 
  };
  @SerializedName("plataforma")
  private PlataformaEnum plataforma = null;
  @SerializedName("protocolo")
  private String protocolo = null;

  
  /**
   * Apresenta a data e em que o registro foi enviado para o dispositivo
   **/
  @ApiModelProperty(value = "Apresenta a data e em que o registro foi enviado para o dispositivo")
  public String getDataEnvio() {
    return dataEnvio;
  }
  public void setDataEnvio(String dataEnvio) {
    this.dataEnvio = dataEnvio;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do emissor (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do emissor (id)")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Nome do tipoEvento da notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome do tipoEvento da notifica\u00E7\u00E3o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Status de envio da notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Status de envio da notifica\u00E7\u00E3o")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo identificado da pessoa
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificado da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Token do dispositivo a qual foi destinado a notifica\u00E7\u00E3o (device_token)
   **/
  @ApiModelProperty(required = true, value = "Token do dispositivo a qual foi destinado a notifica\u00E7\u00E3o (device_token)")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * T\u00EDtulo da notifica\u00E7\u00E3o enviada
   **/
  @ApiModelProperty(required = true, value = "T\u00EDtulo da notifica\u00E7\u00E3o enviada")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Conte\u00FAdo da notifica\u00E7\u00E3o enviada
   **/
  @ApiModelProperty(required = true, value = "Conte\u00FAdo da notifica\u00E7\u00E3o enviada")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Nome do Sistema Operacional a qual foi enviado o Push
   **/
  @ApiModelProperty(value = "Nome do Sistema Operacional a qual foi enviado o Push")
  public PlataformaEnum getPlataforma() {
    return plataforma;
  }
  public void setPlataforma(PlataformaEnum plataforma) {
    this.plataforma = plataforma;
  }

  
  /**
   * N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es
   **/
  @ApiModelProperty(value = "N\u00FAmero do protocolo de envio de notifica\u00E7\u00F5es")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoPushResponse {\n");
    
    sb.append("  dataEnvio: ").append(dataEnvio).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tokenDispositivo: ").append(tokenDispositivo).append("\n");
    sb.append("  titulo: ").append(titulo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  plataforma: ").append(plataforma).append("\n");
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
