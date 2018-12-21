package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{configuracao_email_response_description}}}
 **/
@ApiModel(description = "{{{configuracao_email_response_description}}}")
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
   * {{{configuracao_email_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{configuracao_email_response_host_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_host_value}}}")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  
  /**
   * {{{configuracao_email_response_port_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_port_value}}}")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  
  /**
   * {{{configuracao_email_response_port_t_l_s_s_t_a_r_t_t_l_s_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_port_t_l_s_s_t_a_r_t_t_l_s_value}}}")
  public String getPortTLSSTARTTLS() {
    return portTLSSTARTTLS;
  }
  public void setPortTLSSTARTTLS(String portTLSSTARTTLS) {
    this.portTLSSTARTTLS = portTLSSTARTTLS;
  }

  
  /**
   * {{{configuracao_email_response_port_s_s_l_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_port_s_s_l_value}}}")
  public String getPortSSL() {
    return portSSL;
  }
  public void setPortSSL(String portSSL) {
    this.portSSL = portSSL;
  }

  
  /**
   * {{{configuracao_email_response_protocolo_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_protocolo_value}}}")
  public String getProtocolo() {
    return protocolo;
  }
  public void setProtocolo(String protocolo) {
    this.protocolo = protocolo;
  }

  
  /**
   * {{{configuracao_email_response_requer_autenticacao_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_requer_autenticacao_value}}}")
  public Boolean getRequerAutenticacao() {
    return requerAutenticacao;
  }
  public void setRequerAutenticacao(Boolean requerAutenticacao) {
    this.requerAutenticacao = requerAutenticacao;
  }

  
  /**
   * {{{configuracao_email_response_requer_s_s_l_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_requer_s_s_l_value}}}")
  public Boolean getRequerSSL() {
    return requerSSL;
  }
  public void setRequerSSL(Boolean requerSSL) {
    this.requerSSL = requerSSL;
  }

  
  /**
   * {{{configuracao_email_response_requer_t_l_s_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_requer_t_l_s_value}}}")
  public Boolean getRequerTLS() {
    return requerTLS;
  }
  public void setRequerTLS(Boolean requerTLS) {
    this.requerTLS = requerTLS;
  }

  
  /**
   * {{{configuracao_email_response_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{configuracao_email_response_senha_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_senha_value}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{configuracao_email_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{configuracao_email_response_data_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_email_response_data_alteracao_value}}}")
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
