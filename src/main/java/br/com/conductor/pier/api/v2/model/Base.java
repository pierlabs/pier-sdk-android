package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso Base
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso Base")
public class Base  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("servidor")
  private String servidor = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
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

  
  /**
   * C\u00C3\u00B3digo identificador da base
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador da base")
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
   * Nome do usu\u00C3\u00A1rio
   **/
  @ApiModelProperty(required = true, value = "Nome do usu\u00C3\u00A1rio")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * Senha
   **/
  @ApiModelProperty(required = true, value = "Senha")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
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
   * Dom\u00C3\u00ADnio da base
   **/
  @ApiModelProperty(required = true, value = "Dom\u00C3\u00ADnio da base")
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
   * C\u00C3\u00B3digo do identificador do emissor
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do identificador do emissor")
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  servidor: ").append(servidor).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  nomeBase: ").append(nomeBase).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  nomeBaseControleAcesso: ").append(nomeBaseControleAcesso).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  servidorControleAcesso: ").append(servidorControleAcesso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


