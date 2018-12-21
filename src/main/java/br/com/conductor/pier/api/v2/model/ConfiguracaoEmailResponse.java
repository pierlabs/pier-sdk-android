package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object EMAIL Configuration
 **/
@ApiModel(description = "Object EMAIL Configuration")
public class ConfiguracaoEmailResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("host")
  private String host = null;
  @SerializedName("port")
  private String port = null;
  @SerializedName("portTLSSTARTTLS")
  private String portTLSSTARTTLS = null;
  @SerializedName("portSSL")
  private String portSSL = null;
  @SerializedName("protocolo")
  private String protocolo = null;
  @SerializedName("requerAutenticacao")
  private Boolean requerAutenticacao = null;
  @SerializedName("requerSSL")
  private Boolean requerSSL = null;
  @SerializedName("requerTLS")
  private Boolean requerTLS = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;

  
  /**
   * Id of the EMAIL Configuration
   **/
  @ApiModelProperty(value = "Id of the EMAIL Configuration")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * IP (Host) of the e-mail server
   **/
  @ApiModelProperty(value = "IP (Host) of the e-mail server")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * Door used by the e-mail server
   **/
  @ApiModelProperty(value = "Door used by the e-mail server")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * Door used by the server TLS/STARTTLS
   **/
  @ApiModelProperty(value = "Door used by the server TLS/STARTTLS")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * Door used by the server SSL
   **/
  @ApiModelProperty(value = "Door used by the server SSL")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * Protocol of communication used by the email service (Ex: smtp)
   **/
  @ApiModelProperty(value = "Protocol of communication used by the email service (Ex: smtp)")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * The e-mail service requires authentication
   **/
  @ApiModelProperty(value = "The e-mail service requires authentication")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * The service of email requieres SSL
   **/
  @ApiModelProperty(value = "The service of email requieres SSL")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * the e-mail service requires TLS
   **/
  @ApiModelProperty(value = "the e-mail service requires TLS")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * User of the e-mail service
   **/
  @ApiModelProperty(value = "User of the e-mail service")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Password of user of the e-mail service
   **/
  @ApiModelProperty(value = "Password of user of the e-mail service")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Date of inlcusion
   **/
  @ApiModelProperty(value = "Date of inlcusion")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Date of update
   **/
  @ApiModelProperty(value = "Date of update")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoEmailResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  host: ").append(host).append("\n");
    sb.append("  port: ").append(port).append("\n");
    sb.append("  portTLSSTARTTLS: ").append(portTLSSTARTTLS).append("\n");
    sb.append("  portSSL: ").append(portSSL).append("\n");
    sb.append("  protocolo: ").append(protocolo).append("\n");
    sb.append("  requerAutenticacao: ").append(requerAutenticacao).append("\n");
    sb.append("  requerSSL: ").append(requerSSL).append("\n");
    sb.append("  requerTLS: ").append(requerTLS).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
