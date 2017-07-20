package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Configura\u00C3\u00A7\u00C3\u00A3o EMAIL
 **/
@ApiModel(description = "Objeto Configura\u00C3\u00A7\u00C3\u00A3o EMAIL")
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
   * Id da Configura\u00C3\u00A7\u00C3\u00A3o EMAIL.
   **/
  @ApiModelProperty(value = "Id da Configura\u00C3\u00A7\u00C3\u00A3o EMAIL.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * IP (Host) do servidor de e-mail.
   **/
  @ApiModelProperty(value = "IP (Host) do servidor de e-mail.")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * Porta usada pelo servidor de e-mail.
   **/
  @ApiModelProperty(value = "Porta usada pelo servidor de e-mail.")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * Porta usada pelo servi\u00C3\u00A7o TLS/STARTTLS.
   **/
  @ApiModelProperty(value = "Porta usada pelo servi\u00C3\u00A7o TLS/STARTTLS.")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * Porta usada pelo servi\u00C3\u00A7o SSL.
   **/
  @ApiModelProperty(value = "Porta usada pelo servi\u00C3\u00A7o SSL.")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * Protocolo de comunica\u00C3\u00A7\u00C3\u00A3o usado pelo servi\u00C3\u00A7o de e-mail (Ex: smtp).
   **/
  @ApiModelProperty(value = "Protocolo de comunica\u00C3\u00A7\u00C3\u00A3o usado pelo servi\u00C3\u00A7o de e-mail (Ex: smtp).")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * O servi\u00C3\u00A7o de e-mail requer autentica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "O servi\u00C3\u00A7o de e-mail requer autentica\u00C3\u00A7\u00C3\u00A3o.")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * O servi\u00C3\u00A7o de e-mail requer SSL.
   **/
  @ApiModelProperty(value = "O servi\u00C3\u00A7o de e-mail requer SSL.")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * O servi\u00C3\u00A7o de e-mail requer TLS.
   **/
  @ApiModelProperty(value = "O servi\u00C3\u00A7o de e-mail requer TLS.")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * Usuario do servi\u00C3\u00A7o de e-mail.
   **/
  @ApiModelProperty(value = "Usuario do servi\u00C3\u00A7o de e-mail.")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha de usu\u00C3\u00A1rio do servi\u00C3\u00A7o de e-mail.
   **/
  @ApiModelProperty(value = "Senha de usu\u00C3\u00A1rio do servi\u00C3\u00A7o de e-mail.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Data de inclus\u00C3\u00A3o.")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data de altera\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Data de altera\u00C3\u00A7\u00C3\u00A3o.")
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


