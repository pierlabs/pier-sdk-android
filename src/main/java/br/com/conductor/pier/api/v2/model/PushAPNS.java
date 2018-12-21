package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Push Notification APNS
 **/
@ApiModel(description = "Object Push Notification APNS")
public class PushAPNS  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tokenDispositivo")
  private String tokenDispositivo = null;
  @SerializedName("certificado")
  private String certificado = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("titulo")
  private String titulo = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ERRO,  TRANSACAO_SIMULACAO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_TOKEN, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("som")
  private String som = null;

  
  /**
   * Identification Code of the Person
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Person")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Identifier Code of the account
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * show the token of the device that must recieve the push
   **/
  @ApiModelProperty(required = true, value = "show the token of the device that must recieve the push")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * Show the certificate APNs that is registered to the applicative in the apple store. This certificate must be sent in the format Base64
   **/
  @ApiModelProperty(required = true, value = "Show the certificate APNs that is registered to the applicative in the apple store. This certificate must be sent in the format Base64")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Show the password for the certificate APNs registered to the app in the Apple store
   **/
  @ApiModelProperty(required = true, value = "Show the password for the certificate APNs registered to the app in the Apple store")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Show the title of the notification
   **/
  @ApiModelProperty(required = true, value = "Show the title of the notification")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Show the notification text to be sent
   **/
  @ApiModelProperty(required = true, value = "Show the notification text to be sent")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Show the typeEvent which the notification belongs
   **/
  @ApiModelProperty(required = true, value = "Show the typeEvent which the notification belongs")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Show the Icon name to be presented in the push
   **/
  @ApiModelProperty(value = "Show the Icon name to be presented in the push")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Show the icon color to be presented on the push
   **/
  @ApiModelProperty(value = "Show the icon color to be presented on the push")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushAPNS {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tokenDispositivo: ").append(tokenDispositivo).append("\n");
    sb.append("  certificado: ").append(certificado).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  titulo: ").append(titulo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
