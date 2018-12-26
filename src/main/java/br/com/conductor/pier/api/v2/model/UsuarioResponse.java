package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{usuario_response_description}}}
 **/
@ApiModel(description = "{{{usuario_response_description}}}")
public class UsuarioResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("dataCriacao")
  private String dataCriacao = null;
  @SerializedName("dataModificacao")
  private String dataModificacao = null;
  @SerializedName("tentativasIncorretas")
  private Long tentativasIncorretas = null;
  @SerializedName("bloquearAcesso")
  private Boolean bloquearAcesso = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("idPlataforma")
  private Integer idPlataforma = null;

  
  /**
   * {{{usuario_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{usuario_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_response_login_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{usuario_response_login_value}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_response_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{usuario_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_response_email_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{usuario_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{usuario_response_data_criacao_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_data_criacao_value}}}")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * {{{usuario_response_data_modificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_data_modificacao_value}}}")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  
  /**
   * {{{usuario_response_tentativas_incorretas_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_tentativas_incorretas_value}}}")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * {{{usuario_response_bloquear_acesso_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_bloquear_acesso_descricao}}}")
  public Boolean getBloquearAcesso() {
    return bloquearAcesso;
  }
  public void setBloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
  }

  
  /**
   * {{{usuario_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{usuario_response_id_plataforma_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_response_id_plataforma_value}}}")
  public Integer getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Integer idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCriacao: ").append(dataCriacao).append("\n");
    sb.append("  dataModificacao: ").append(dataModificacao).append("\n");
    sb.append("  tentativasIncorretas: ").append(tentativasIncorretas).append("\n");
    sb.append("  bloquearAcesso: ").append(bloquearAcesso).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
