package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso Base
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso Base")
public class BaseResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("servidor")
  private String servidor = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("nomeBase")
  private String nomeBase = null;
  @SerializedName("senhaCriptografada")
  private Boolean senhaCriptografada = null;
  @SerializedName("domain")
  private String domain = null;
  @SerializedName("nomeBaseControleAcesso")
  private String nomeBaseControleAcesso = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("servidorControleAcesso")
  private String servidorControleAcesso = null;
  @SerializedName("nomeBaseUsuarios")
  private String nomeBaseUsuarios = null;
  @SerializedName("servidorUsuarios")
  private String servidorUsuarios = null;
  @SerializedName("flagCluster")
  private Boolean flagCluster = null;

  
  /**
   * C\u00F3digo identificador da base
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da base")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * IP do servidor
   **/
  @ApiModelProperty(required = true, value = "IP do servidor")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * Nome do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "Nome do usu\u00E1rio")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Nome da base
   **/
  @ApiModelProperty(required = true, value = "Nome da base")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * senha Criptografada
   **/
  @ApiModelProperty(required = true, value = "senha Criptografada")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * Dom\u00EDnio da base
   **/
  @ApiModelProperty(required = true, value = "Dom\u00EDnio da base")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * Nome da base de controle acesso
   **/
  @ApiModelProperty(required = true, value = "Nome da base de controle acesso")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * C\u00F3digo do identificador do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo do identificador do emissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Servidor do controle de acesso
   **/
  @ApiModelProperty(required = true, value = "Servidor do controle de acesso")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  
  /**
   * Nome da base de usu\u00E1rios
   **/
  @ApiModelProperty(required = true, value = "Nome da base de usu\u00E1rios")
  public String getNomeBaseUsuarios() {
    return nomeBaseUsuarios;
  }
  public void setNomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
  }

  
  /**
   * Servidor do controle de acesso
   **/
  @ApiModelProperty(required = true, value = "Servidor do controle de acesso")
  public String getServidorUsuarios() {
    return servidorUsuarios;
  }
  public void setServidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
  }

  
  /**
   * Flag Cluester
   **/
  @ApiModelProperty(value = "Flag Cluester")
  public Boolean getFlagCluster() {
    return flagCluster;
  }
  public void setFlagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  servidor: ").append(servidor).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  nomeBase: ").append(nomeBase).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  nomeBaseControleAcesso: ").append(nomeBaseControleAcesso).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  servidorControleAcesso: ").append(servidorControleAcesso).append("\n");
    sb.append("  nomeBaseUsuarios: ").append(nomeBaseUsuarios).append("\n");
    sb.append("  servidorUsuarios: ").append(servidorUsuarios).append("\n");
    sb.append("  flagCluster: ").append(flagCluster).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
