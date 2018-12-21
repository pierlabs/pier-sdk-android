package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representatio of the email configuration resource
 **/
@ApiModel(description = "Request Representatio of the email configuration resource")
public class ConfiguracaoEmailPersist  {
  
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

  
  /**
   * IP (Host) of the email server
   **/
  @ApiModelProperty(value = "IP (Host) of the email server")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * Way used by the e-mail server
   **/
  @ApiModelProperty(value = "Way used by the e-mail server")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * Door used by the service TLS/STARTTLS
   **/
  @ApiModelProperty(value = "Door used by the service TLS/STARTTLS")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * Tool used by the server SSL
   **/
  @ApiModelProperty(value = "Tool used by the server SSL")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * Protocol of communication used by the e-mail service
   **/
  @ApiModelProperty(value = "Protocol of communication used by the e-mail service")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * The service of the email requires authentication
   **/
  @ApiModelProperty(value = "The service of the email requires authentication")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * O servi?o de e-mail requer SSL
   **/
  @ApiModelProperty(value = "O servi?o de e-mail requer SSL")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * The service of the email requires TLS
   **/
  @ApiModelProperty(value = "The service of the email requires TLS")
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
   * User Password of the email service
   **/
  @ApiModelProperty(value = "User Password of the email service")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoEmailPersist {\n");
    
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
    sb.append("}\n");
    return sb.toString();
  }
}
