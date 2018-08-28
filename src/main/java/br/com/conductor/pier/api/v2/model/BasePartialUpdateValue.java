package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{base_partial_update_description}}}
 **/
@ApiModel(description = "{{{base_partial_update_description}}}")
public class BasePartialUpdateValue  {
  
  @SerializedName("servidor")
  private String servidor = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;
  @SerializedName("nomeBase")
  private String nomeBase = null;
  @SerializedName("alteradoPor")
  private String alteradoPor = null;
  @SerializedName("domain")
  private String domain = null;
  @SerializedName("senhaCriptografada")
  private Boolean senhaCriptografada = null;
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
   * {{{base_partial_update_servidor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_servidor_value}}}")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * {{{base_partial_update_usuario_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{base_partial_update_senha_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_senha_value}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{base_partial_update_nome_base_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_nome_base_value}}}")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * {{{base_partial_update_alterado_por_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_alterado_por_value}}}")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * {{{base_partial_update_domain_value}}}
   **/
  @ApiModelProperty(value = "{{{base_partial_update_domain_value}}}")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * {{{base_partial_update_senha_criptografada_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_senha_criptografada_value}}}")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{base_partial_update_nome_base_controle_acesso_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_nome_base_controle_acesso_value}}}")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * {{{base_partial_update_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{base_partial_update_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{base_partial_update_servidor_controle_acesso_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_servidor_controle_acesso_value}}}")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  
  /**
   * {{{base_partial_update_nome_base_usuarios_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_nome_base_usuarios_value}}}")
  public String getNomeBaseUsuarios() {
    return nomeBaseUsuarios;
  }
  public void setNomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
  }

  
  /**
   * {{{base_partial_update_servidor_usuarios_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_servidor_usuarios_value}}}")
  public String getServidorUsuarios() {
    return servidorUsuarios;
  }
  public void setServidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
  }

  
  /**
   * {{{base_partial_update_flag_cluster_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{base_partial_update_flag_cluster_value}}}")
  public Boolean getFlagCluster() {
    return flagCluster;
  }
  public void setFlagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasePartialUpdateValue {\n");
    
    sb.append("  servidor: ").append(servidor).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("  nomeBase: ").append(nomeBase).append("\n");
    sb.append("  alteradoPor: ").append(alteradoPor).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
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
