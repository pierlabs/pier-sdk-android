package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Push Notifica\u00C3\u00A7\u00C3\u00A3o APNS
 **/
@ApiModel(description = "Objeto Push Notifica\u00C3\u00A7\u00C3\u00A3o APNS")
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
     RISCO_FRAUDE,  TOKEN_SMS,  OUTROS, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("som")
  private String som = null;

  
  /**
   * C\u00C3\u00B3digo identificado da pessoa
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificado da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o token do dispositivo que dever\u00C3\u00A1 receber o push.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o token do dispositivo que dever\u00C3\u00A1 receber o push.")
  public String getTokenDispositivo() {
    return tokenDispositivo;
  }
  public void setTokenDispositivo(String tokenDispositivo) {
    this.tokenDispositivo = tokenDispositivo;
  }

  
  /**
   * Apresenta o certificado APNs que est\u00C3\u00A1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00C3\u00A1 ser enviado no formado Base64.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o certificado APNs que est\u00C3\u00A1 cadastrado para o aplicativo na loja da Apple. Esse certificado dever\u00C3\u00A1 ser enviado no formado Base64.")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Apresenta a senha para o certificado APNs que est\u00C3\u00A1 cadastrado para o aplicativo na loja da Apple.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a senha para o certificado APNs que est\u00C3\u00A1 cadastrado para o aplicativo na loja da Apple.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Apresenta o t\u00C3\u00ADtulo da notifica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o t\u00C3\u00ADtulo da notifica\u00C3\u00A7\u00C3\u00A3o.")
  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  
  /**
   * Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o texto da notifica\u00C3\u00A7\u00C3\u00A3o a ser enviado.")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta o tipoEvento a qual pertence a notifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta o tipoEvento a qual pertence a notifica\u00C3\u00A7\u00C3\u00A3o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Apresenta o nome do icone a ser apresentado no push.
   **/
  @ApiModelProperty(value = "Apresenta o nome do icone a ser apresentado no push.")
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


