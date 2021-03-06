package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso Configura\u00E7\u00E3o Email
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o do recurso Configura\u00E7\u00E3o Email")
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
   * IP (Host) do servidor de e-mail
   **/
  @ApiModelProperty(value = "IP (Host) do servidor de e-mail")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * Porta usada pelo servidor de e-mail
   **/
  @ApiModelProperty(value = "Porta usada pelo servidor de e-mail")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * Porta usada pelo servi\u00E7o TLS/STARTTLS
   **/
  @ApiModelProperty(value = "Porta usada pelo servi\u00E7o TLS/STARTTLS")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * Porta usada pelo servi\u00E7o SSL
   **/
  @ApiModelProperty(value = "Porta usada pelo servi\u00E7o SSL")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * Protocolo de comunica\u00E7\u00E3o usado pelo servi\u00E7o de e-mail
   **/
  @ApiModelProperty(value = "Protocolo de comunica\u00E7\u00E3o usado pelo servi\u00E7o de e-mail")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * O servi\u00E7o de e-mail requer autentica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "O servi\u00E7o de e-mail requer autentica\u00E7\u00E3o")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * O servi\u00E7o de e-mail requer SSL
   **/
  @ApiModelProperty(value = "O servi\u00E7o de e-mail requer SSL")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * O servi\u00E7o de e-mail requer TLS
   **/
  @ApiModelProperty(value = "O servi\u00E7o de e-mail requer TLS")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * Usuario do servi\u00E7o de e-mail
   **/
  @ApiModelProperty(value = "Usuario do servi\u00E7o de e-mail")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha de usu\u00E1rio do servi\u00E7o de e-mail
   **/
  @ApiModelProperty(value = "Senha de usu\u00E1rio do servi\u00E7o de e-mail")
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
