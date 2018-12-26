package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Push Notifica\u00E7\u00E3o APNS
 **/
@ApiModel(description = "Objeto Push Notifica\u00E7\u00E3o APNS")
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
   * Apresenta o token do dispositivo que dever\u00E1 receber o push
   **/
  @ApiModelProperty(required = true, value = "Apresenta o token do dispositivo que dever\u00E1 receber o push")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * Apresenta o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00E1 ser enviado no formado Base64
   **/
  @ApiModelProperty(required = true, value = "Apresenta o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00E1 ser enviado no formado Base64")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Apresenta a senha para o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple
   **/
  @ApiModelProperty(required = true, value = "Apresenta a senha para o certificado APNs que est\u00E1 cadastrado para o aplicativo na loja da Apple")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Apresenta o t\u00EDtulo da notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta o t\u00EDtulo da notifica\u00E7\u00E3o")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Apresenta o texto da notifica\u00E7\u00E3o a ser enviado
   **/
  @ApiModelProperty(required = true, value = "Apresenta o texto da notifica\u00E7\u00E3o a ser enviado")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Apresenta o nome do icone a ser apresentado no push
   **/
  @ApiModelProperty(value = "Apresenta o nome do icone a ser apresentado no push")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Apresenta o cor do icone a ser apresentado no push
   **/
  @ApiModelProperty(value = "Apresenta o cor do icone a ser apresentado no push")
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
